package com.spring.di.dependencyinjection.clients;

import com.spring.di.dependencyinjection.entities.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClientForAnimal {

    private Animal animal;

    @Autowired
    public ClientForAnimal(@Qualifier("Cat") Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "ClientForAnimal{" +
                "animal=" + animal.makeNoise() +
                '}';
    }
}
