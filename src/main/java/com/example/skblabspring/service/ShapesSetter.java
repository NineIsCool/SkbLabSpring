package com.example.skblabspring.service;

import com.example.skblabspring.models.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShapesSetter {
    private Shape shapeRectangle;
    private Shape shapeCircle;

    @Autowired
    @Qualifier("rectangleSample")
    public void setRectangle(Shape rectangle) {
        this.shapeRectangle = rectangle;
    }

    @Autowired
    @Qualifier("circleSample")
    public void setCircle(Shape circle) {
        this.shapeCircle = circle;
    }
}
