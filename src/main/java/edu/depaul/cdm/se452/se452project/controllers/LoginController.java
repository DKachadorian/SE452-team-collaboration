package edu.depaul.cdm.se452.se452project.controllers;
import edu.depaul.cdm.se452.se452project.dto.CustomerId;
import edu.depaul.cdm.se452.se452project.dto.LoginFields;
import edu.depaul.cdm.se452.se452project.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService; }

    @ModelAttribute
    public void generateModel(Model model) {
        model.addAttribute("loginFields", new LoginFields());
    }

    @GetMapping(value="/login")
    public String login() {
        return "login";
    }

    @PostMapping(value="/loginVerification")
    public String loginVerification(@ModelAttribute(value="loginFields") LoginFields loginFields, Model model) {
        if(loginService.validateLoginCredentialsEmp(loginFields)) {
            return "homeLoggedInEmp";
        }
        else if(loginService.validateLoginCredentials(loginFields)) {
            CustomerId customerId = new CustomerId();
            customerId.setCustomerId(loginService.retrieveCustomerId(loginFields));
            model.addAttribute("customerId", customerId);
            return "homeLoggedIn";
        }
        return "home";
    }

    @GetMapping(value="/logout")
    public String logout() {
        return "home";
    }
}
