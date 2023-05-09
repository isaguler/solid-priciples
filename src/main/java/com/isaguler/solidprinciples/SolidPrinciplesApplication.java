package com.isaguler.solidprinciples;

import com.isaguler.solidprinciples.model.Circle;
import com.isaguler.solidprinciples.model.Cube;
import com.isaguler.solidprinciples.model.Shape;
import com.isaguler.solidprinciples.model.Square;
import com.isaguler.solidprinciples.service.AreaCalculator;
import com.isaguler.solidprinciples.service.IAreaCalculator;
import com.isaguler.solidprinciples.service.ShapesPrinter;

import java.util.List;

public class SolidPrinciplesApplication {

	public static void main(String[] args) {

		IAreaCalculator areaCalculator = new AreaCalculator();

		Circle circle = new Circle(10);
		Square square = new Square(10);
		Cube cube = new Cube(10);

		ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
		List<Shape> shapes = List.of(circle, square, cube);
		int sum = areaCalculator.sum(shapes);

		System.out.println("sum = " + shapesPrinter.json(shapes));
		System.out.println("sum = " + shapesPrinter.csv(shapes));
	}

}
