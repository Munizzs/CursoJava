package com.estudo.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/public")
    @ResponseBody
    public String publicPage() {
        return "This is a public page.";
    }

    @GetMapping("/private")
    @ResponseBody
    public String privatePage() {
        return "This is a private page. You must be logged in to see this.";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
