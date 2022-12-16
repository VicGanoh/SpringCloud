package com.vicgan.consumingapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nationality")
public class ApiController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL = "https://api.nationalize.io/?name=";

    @GetMapping("/{name}")
    public Object getNationalityOfAName(@PathVariable("name") String name){
        return restTemplate.getForObject(URL + name, Object.class);
    }

}
