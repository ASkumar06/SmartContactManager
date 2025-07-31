package com.project.smartcontactmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("Username","Ankit");
        model.addAttribute("Title","Smart Contact Manager");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/ankit-suresh-kumar-5b2a62293/");
        return "home";
    }
}
