package estudos.springboot.jpa.controller;

import estudos.springboot.jpa.entity.Usuario;
import estudos.springboot.jpa.http.HttpStatus.ResourceNotFoundException;
import estudos.springboot.jpa.jpaRepository.UsuarioRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    @Operation(summary = "View a list of available users", description = "Retorna uma lista de usuários")
    public List<Usuario> getAll(){
        return repository.findAll();
    }

    @PostMapping
    @Operation(summary = "Add a new user", description = "Adiciona um novo usuário")
    public Usuario create(@RequestBody Usuario user){
        return repository.save(user);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a user by Id", description = "Retorna um usuário pelo ID")
    public Usuario getId(@PathVariable Integer id){
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a user", description = "Atualiza um usuário existente")
    public Usuario update(@PathVariable Integer id, @RequestBody Usuario user){
        Usuario usuario =  repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));

        usuario.setNome(user.getNome());
        usuario.setEmail(user.getEmail());

        return repository.save(usuario);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a user", description = "Deleta um usuário pelo ID")
    public void delete(@PathVariable Integer id){
        Usuario usuario =  repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));

        repository.delete(usuario);
    }

}
