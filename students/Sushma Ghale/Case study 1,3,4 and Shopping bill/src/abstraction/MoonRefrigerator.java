package abstraction;

import java.util.Scanner;

class Wiring {// using encapsulation
	private String wiringType;

	public String wiringType() {
		return wiringType;
	}

	public String getWiringType() {
		return wiringType;
	}

	public void setWiringType(String wiringType) {
		this.wiringType = wiringType;
	}
}

abstract class Mprocess {
	abstract void door();

	abstract void colour();

	abstract void size();

	abstract void temperature();
}

class Refrigrator extends Mprocess {
	Scanner rf = new Scanner(System.in);

	void door() {
		System.out.println("Available Refrigrators with perticular Door");
		System.out.println("1.Single Door" + "\n" + "2.Double Door" + "\n" + "Enter your Door Choice");
		int choice = rf.nextInt();
	}

	void colour() {
		System.out.println("Available Colours");
		System.out.println("1.White" + "\n" + "2.Red" + "\n" + "Enter your Colour Choice");
		int colour = rf.nextInt();
	}

	void size() {
		System.out.println("Available Capacitys for Refrigrator");
		System.out.println("1.500Liters" + "\n" + "2.250Liters" + "\n" + "Enter your Capacity Choice");
		int size = rf.nextInt();
	}

	void temperature() {
		System.out.println("Temperature");
		System.out.println("1.High" + "\n" + "2.Medium" + "\n " + "3.Low" + "\n" + "Enter your Temperature Choice");
		int temp = rf.nextInt();
		System.out.println("You can change the temperature by adjusting temperature button");
	}
}

/*
 * class Oven extends Mprocess{
 * 
 * }
 */
public class MoonRefrigerator {
	public static void main(String[] args) {
		Scanner mr = new Scanner(System.in);
		System.out.println("Welcome to Moon Refrigrators");
		Mprocess mrf = new Refrigrator();
		Wiring mm = new Wiring();
		mm.setWiringType("Hidden");
		System.out.println(mm.getWiringType());
		mrf.door();
		mrf.colour();
		mrf.size();
		mrf.temperature();
	}

}
