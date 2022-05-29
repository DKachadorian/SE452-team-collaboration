package edu.depaul.cdm.se452.se452project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import edu.depaul.cdm.se452.se452project.entities.Dealership;
import edu.depaul.cdm.se452.se452project.repositories.DealershipRepository;

@Controller
public class DealershipController {
  
    DealershipRepository dealershipRepository;
 
    @Autowired
    public DealershipController(DealershipRepository dealershipRepository) {
        this.dealershipRepository = dealershipRepository;
    }

    @GetMapping(value="/viewDealerships")
    public String viewDealers(Model model) {

        List<Dealership> dealerList = dealershipRepository.findAll();
        model.addAttribute("dealerships",dealerList);

        return "viewDealerships";
    }


}


