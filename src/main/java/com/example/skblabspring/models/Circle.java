package com.example.skblabspring.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Log4j2
@Component(value = "circleSample")
public class Circle implements Shape {
    private int radius;

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    @PreDestroy
    private void destroyBean() {
        log.info(this + ": destroy bean!");
    }

    @PostConstruct
    private void initBean() {
        log.info(this + ": init bean!");
    }
}
