package com.isaguler.solidprinciples.model;

public class Cube implements Shape, ThreeDimensionalShape{

    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return Math.pow(getLength(), 2) * 6;
    }

    @Override
    public double volume() {
        return Math.pow(getLength(), 3);
    }
}
