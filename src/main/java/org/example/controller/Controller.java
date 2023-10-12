package org.example.controller;

import org.example.person.Person;
import org.example.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getCity(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}
