package com.sparkarabic.registryservice.client;

import com.sparkarabic.registryservice.entities.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "persons-svc")
public interface PersonClient {
    @GetMapping
    public List<Person> getAll();

    @GetMapping("/private")
    public String getPrivate();

}


