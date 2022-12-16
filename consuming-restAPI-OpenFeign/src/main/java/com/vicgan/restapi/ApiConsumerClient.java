package com.vicgan.restapi;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "api-service")
public interface ApiConsumerClient {

    @GetMapping("/?name={name}")
    public Object getNationalityOfAName(@PathVariable("name") String name);

    @GetMapping("/?name={name}")
    public Object getGenderBasedOnName(@PathVariable("name") String name);
}
