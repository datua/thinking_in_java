package com.wzj.thinkinginjava.typeinfo;

import java.util.Arrays;
import java.util.List;

abstract class Shape {
	void draw() {
		System.out.println(this + ".draw()");
	}

	abstract public String toString();
}

class Circle extends Shape {
	@Override
	public String toString() {
		return "circle";
	}
}

class Square extends Shape {
	@Override
	public String toString() {
		return "square";
	}
}

class Triangle extends Shape {
	@Override
	public String toString() {
		return "triangle";
	}
}

public class Shapes {
	public static void main(String[] args) {
		List<Shape> shapeList = Arrays.asList(new Shape[] {
				new Circle(), new Square(), new Triangle() });
		
		for (Shape shape : shapeList) {
			shape.draw();
			System.out.println(shape.getClass());
		}
	}
}
