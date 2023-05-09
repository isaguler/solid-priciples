package com.isaguler.solidprinciples.service;

import com.isaguler.solidprinciples.model.Shape;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }

        return sum;
    }
}
