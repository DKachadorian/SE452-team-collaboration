package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.dto.ReturnCarForm;
import edu.depaul.cdm.se452.se452project.services.ReturnCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ReturnCarFormController {

    ReturnCarService returnCarService;

    @Autowired
    public ReturnCarFormController(ReturnCarService returnCarService) {
        this.returnCarService = returnCarService;}

    @ModelAttribute
    public void generateModel(Model model) {
        model.addAttribute("rcf", new ReturnCarForm());
        // getting error: Caused by: java.lang.IllegalStateException: Neither BindingResult nor plain target object for bean name 'rcf' available as request attribute
    }

    @GetMapping(value="/returnCarForm")
    public String returnCarForm() {
        // init form - populate reservation number on the form???

        return "returnCarForm";
    }

    //WIPWIPWIPWIP
    @PostMapping(value="/returnCarFormVerification")
    public String validateReturnForm(@ModelAttribute(value="rcf") ReturnCarForm returnCarForm) {
        if (returnCarService.validateReturn(returnCarForm)) {
            return "homeLoggedInEmp"; //Return Complete
        }
        return "returnCarForm"; // no success
    }

}
