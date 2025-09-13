package org.lessons.java.spring.hello_spring_mvc.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("email", "gina@gmail.com");
        model.addAttribute("currentDate", LocalDateTime.now());
        model.addAttribute("name", name);

        return "greeting";
    }
}
