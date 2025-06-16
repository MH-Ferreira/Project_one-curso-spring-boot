package com.senai.project_one.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class HelloworldService {

    public String helloWorld(String name) {
        return "Hello World" + name;
    }


}
