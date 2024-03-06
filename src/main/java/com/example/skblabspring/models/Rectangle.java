package com.example.skblabspring.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Log4j2
@Component(value = "rectangleSample")
public class Rectangle implements Shape {
    private int height;
    private int width;

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
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
