package edu.depaul.cdm.se452.se452project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeEmployeeController {

    @GetMapping(value = "/homeLoggedInEmp")
    public String homePageEmp(){
        return "homeLoggedInEmp";
    }

}
