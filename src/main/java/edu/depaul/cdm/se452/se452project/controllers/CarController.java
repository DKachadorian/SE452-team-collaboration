package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Car;
import edu.depaul.cdm.se452.se452project.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {

    CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping(value="/viewCars")
    public String viewCars(Model model) {

        List<Car> carList = carRepository.findAll();
        List<Car> carListAvailable = carRepository.findAllAvailable();
        List<String> i = carRepository.findUniqueModels();

        model.addAttribute("cars", carList);
        model.addAttribute("numCars", carListAvailable.size());
        model.addAttribute("numModels", i.size());
        return "viewCars";
    }

    // write view CarBrands here
    @GetMapping(value="/viewCarBrands")
    public String viewCarBrands(Model model) {

        //List<Car> carBrandList = carRepository.findDistinctByCarManufacturer();
        //model.addAttribute("carBrands", carBrandList);

        return "viewCarBrands";
    }


}
