package estudos.web.api.service;

import estudos.web.api.model.Usuario;
import estudos.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> getAll(){
        return repository.findAll();
    }

    public Optional<Usuario> getById(Integer id){
        return repository.findById(id);
    }

    public Usuario save(Usuario usuario){
        return repository.save(usuario);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
