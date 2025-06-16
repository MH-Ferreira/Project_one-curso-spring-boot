package com.senai.project_one.controller;

import com.senai.project_one.service.HelloworldService;


import org.springframework.beans.factory.annotation.Autowired;
import com.senai.project_one.domain.User;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloworldService helloworldService;



    @GetMapping
    public String helloWorld() {
        return helloworldService.helloWorld(" - Matheus");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable ("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World " + body.getName() + " " + body.getEmail() + id + filter;
    }
}
