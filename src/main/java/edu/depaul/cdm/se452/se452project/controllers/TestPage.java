package edu.depaul.cdm.se452.se452project.controllers;

import edu.depaul.cdm.se452.se452project.entities.TestTable;
import edu.depaul.cdm.se452.se452project.repositories.TestPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestPage {

    TestPageRepository testPageRepository;

    public TestPage(@Autowired TestPageRepository testPageRepository) {
        this.testPageRepository = testPageRepository;
    }

    @GetMapping(value ="/entries", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TestTable> addNewTestPage() {
        return testPageRepository.findAll();
    }

}
