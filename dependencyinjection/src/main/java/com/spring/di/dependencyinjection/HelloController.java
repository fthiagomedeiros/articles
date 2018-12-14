package com.spring.di.dependencyinjection;

import com.spring.di.dependencyinjection.entities.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class HelloController {

    @Qualifier("Dog")
    @Autowired
    Animal animal;

    @GetMapping
    public ResponseEntity<String> getHello() {
        return new ResponseEntity<>("Hello, world!", OK);
    }

    @GetMapping(value = "/cat")
    public ResponseEntity<String> getAnimal() {
        return new ResponseEntity<>(animal.makeNoise(), OK);
    }
}
