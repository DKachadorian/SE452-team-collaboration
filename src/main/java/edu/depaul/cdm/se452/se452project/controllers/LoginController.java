package edu.depaul.cdm.se452.se452project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage(@RequestParam(name="profile") String profile, Model model) {
        model.addAttribute("profile", profile);
        return "login";
    }
}
