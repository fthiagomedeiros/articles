package com.spring.di.dependencyinjection.controllers;

import com.spring.di.dependencyinjection.clients.ClientForAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class HelloController {

    @Autowired
    ClientForAnimal clientForAnimal;

    @GetMapping("/testdi")
    public ResponseEntity<String> getHello() {
        return new ResponseEntity<>(clientForAnimal.toString(), OK);
    }

}
