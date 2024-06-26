package Estudos.SpringBoot_JPA.repository;

import Estudos.SpringBoot_JPA.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
