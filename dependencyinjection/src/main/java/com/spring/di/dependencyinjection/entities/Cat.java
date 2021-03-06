package com.spring.di.dependencyinjection.entities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Cat")
public class Cat implements Animal {

    @Override
    public String makeNoise() {
        return "Meowww";
    }
}