package com.sparkarabic.registryservice.client;

import com.sparkarabic.registryservice.entities.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "persons-svc") // this name should be same as
// service name of person project e.g.
//         persons-svc             ClusterIP      10.100.184.33    <none>        80/TCP
// note this is not the load balancer
public interface PersonClient {
    @GetMapping
    public List<Person> getAll();

    @GetMapping("/private")
    public String getPrivate();

}


