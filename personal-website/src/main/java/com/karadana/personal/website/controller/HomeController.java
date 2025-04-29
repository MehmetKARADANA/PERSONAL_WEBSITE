package com.karadana.personal.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "Mehmet Karadaş");
        model.addAttribute("github", "https://github.com/kullaniciadi");
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("projects", java.util.List.of(
                "NLP Sentiment Analyzer",
                "Kotlin Android App",
                "Java REST API Server"
        ));
        return "projects";
    }
}
