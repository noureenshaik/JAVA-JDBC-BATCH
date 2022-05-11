package com.javapoint;

class Polygon {
	public void render() {
		System.out.println("Rendering Polygon...");
	}
}

class Square extends Polygon {
	// renders Square
	public void render() {
		System.out.println("Rendering Square...");
	}
}

class Circle extends Polygon {
	// renders circle
	public void render() {
		System.out.println("Rendering Circle...");
	}
}

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object of Square

		Square s1 = new Square();
		s1.render();
		// create an object of Circle
		Circle c1 = new Circle();
		c1.render();

	}

}
