package estudos.springboot.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping
    public String sayHello(){
        return "Hello! \n\n0:35 ━❍──────── -5:32";
    }

    @GetMapping("/message={msg}")
    public String sayHello(@PathVariable String msg){
        return msg;
    }
}
