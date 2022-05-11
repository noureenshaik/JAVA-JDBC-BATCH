package polymorphism;

public class PolymorphismPolygons {
	public static void main(String[] args) {
		Polygon p = new Polygon();
		p.render();
        // create an object of Square
	    Square s1 = new Square();
	    s1.render();
	    // create an object of Circle
	    Circle c1 = new Circle();
	    c1.render();
  }

}
