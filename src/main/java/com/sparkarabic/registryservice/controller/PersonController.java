package com.sparkarabic.registryservice.controller;

import com.sparkarabic.registryservice.client.PersonClient;
import com.sparkarabic.registryservice.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonClient personClient;

    @GetMapping("/feign/person")
    public List<Person> getAll() {
        return personClient.getAll();
    }

    @GetMapping("/feign/private")
    public String getPrivate() {
        return personClient.getPrivate();
    }
}
