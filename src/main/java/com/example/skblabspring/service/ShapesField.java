package com.example.skblabspring.service;

import com.example.skblabspring.models.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ShapesField {
    @Autowired
    @Qualifier("rectangleSample")
    private Shape shapeRectangle;
    @Autowired
    @Qualifier("circleSample")
    private Shape shapeCircle;
}
