package com.spring.di.dependencyinjection.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("Dog")
@Component
public class Dog implements Animal {

    @Override
    public String makeNoise() {
        return "Au au";
    }
}
