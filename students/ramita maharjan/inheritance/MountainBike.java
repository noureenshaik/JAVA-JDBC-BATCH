package inheritance;

public class MountainBike extends Bicycle{
	private int seatHeight;

	
	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	@Override
	public String printInfo() {
		return (super.printInfo() + "\nseat height is "
				+ seatHeight);
	}
	
}
