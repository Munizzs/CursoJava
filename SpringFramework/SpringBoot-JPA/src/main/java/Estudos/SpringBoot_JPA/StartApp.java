package Estudos.SpringBoot_JPA;

import Estudos.SpringBoot_JPA.model.User;
import Estudos.SpringBoot_JPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUser("Muniz");
        user.setUsername("Matheus Muniz");
        user.setPassword("12345678");

        repository.save(user);

        for (User u:repository.findAll()){
            System.out.println(u);
        }
    }
}
