package com.inheritance.parttwo;

public class MountainBike extends Bicycle {

	public int seatHeight;

	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		seatHeight = startHeight;
	}

	// the MountainBike subclass adds one more method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	// overriding toString() method
	// of Bicycle to print more info
	@Override
	public String toString() {
		return (super.toString() + "\nseat height is " + seatHeight);
	}

}
