package com.example.skblabspring.service;

import com.example.skblabspring.models.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShapesConstructor {
    private Shape shapeRectangle;
    private Shape shapeCircle;

    @Autowired
    public ShapesConstructor(@Qualifier("rectangleSample") Shape rectangle,
                            @Qualifier("circleSample") Shape circle) {
        this.shapeRectangle = rectangle;
        this.shapeCircle = circle;
    }
}
