
  class Bike {
	 public int gear;
	 public int speed;
	 
	 public Bike(int geear, int speed) {
		 this.gear=gear;
		 this.speed=speed;
	 }
	 public void applyBrake(int decreament) {
		 speed-=decreament;
	 }
	 public void speedUp(int increament) {
		 speed+=increament;
	 }
	 public String toString() {
		 return("no of gear are "+gear+" speed of bike is "+speed);
	 }
	
}
  class MountainBike extends Bike{
	  public int seatHeight;
	  public MountainBike(int gear,int speed,int startHeight) {
		  super(gear,speed);
		  seatHeight=startHeight;
	  }
	  public void setHeight(int newValue) {
		  seatHeight=newValue;
	  }
	  @Override public String toString() {
		  return (super.toString()+"\n seat Height is "+seatHeight);
		  
	  }
	 
 }
   class Test{
	  public static void main(String [] args) {
		  MountainBike mb=new MountainBike(3,100,25);
		  System.out.println(mb.toString());
	  }
  }
