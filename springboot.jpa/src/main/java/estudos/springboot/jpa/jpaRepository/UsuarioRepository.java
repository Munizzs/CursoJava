package estudos.springboot.jpa.jpaRepository;

import estudos.springboot.jpa.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

}
