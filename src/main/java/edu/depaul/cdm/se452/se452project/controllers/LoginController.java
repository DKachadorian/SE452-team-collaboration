package edu.depaul.cdm.se452.se452project.controllers;
import edu.depaul.cdm.se452.se452project.dto.LoginFields;
import edu.depaul.cdm.se452.se452project.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @ModelAttribute
    public void generateModel(Model model) {
        model.addAttribute("loginFields", new LoginFields());
    }

    @GetMapping(value="/login")
    public String login() {
        return "login";
    }

    @PostMapping(value="/loginVerification")
    public String loginVerification(@ModelAttribute(value="loginFields") LoginFields loginFields) {
        if (loginService.validateLoginCredentialsEmp(loginFields)) {
                return "homeLoggedInEmp"; //Check if employee has logged in
            }
        else if (loginService.validateLoginCredentials(loginFields)) {
                return "homeLoggedIn"; // check if customer has logged in
            }
         return "home";
        }
}
