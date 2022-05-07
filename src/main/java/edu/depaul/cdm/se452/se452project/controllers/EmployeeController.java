package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.Employee;
import edu.depaul.cdm.se452.se452project.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    EmployeeRepository employeeRepository;

    public EmployeeController(@Autowired EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping(value ="/allEmployees", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value ="/singleEmployee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Employee> getSingleEmployee(@RequestBody Long employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @DeleteMapping(value ="/deleteEmployee", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void deleteEmployee(@RequestBody Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
