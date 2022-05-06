package inheritance;

public class Bicycle {
	private int gear;
	private int speed;
	public Bicycle(int gear, int speed) {
		super();
		this.gear = gear;
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		this.speed -= decrement;
	}
	
	public void speedUp(int incr) {
		this.speed += incr;
	}
	public String printInfo() {
		return ("No of gears are " + gear + "\n" + " speed of bicycle is " + speed);
	}
}
