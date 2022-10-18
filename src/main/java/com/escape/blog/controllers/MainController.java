package com.escape.blog.controllers;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(@NotNull Model model) {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/recommendation")
    public String recommendation(@NotNull Model model) {
        model.addAttribute("title", "Рекомендации");
        return "recommendation";
    }

}