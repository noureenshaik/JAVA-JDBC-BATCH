package com.polymorphism;

class Polygon {
	public void render() {
		System.out.println("Rendering Polygon...");
	}
}

class Square extends Polygon {
	public void render() {
		System.out.println("Rendering Square...");
	}
}

class Circle extends Polygon {
	public void render() {
		System.out.println(" Rendering Cirle...");
	}
}

class PM_Example2 {
	public static void main(String[] args) {
		Polygon p1 = new Polygon();
		p1.render();
		Circle c1 = new Circle();

		c1.render();

		Square s1 = new Square();
		s1.render();

	}
}