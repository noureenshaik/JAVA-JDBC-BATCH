package polymorphism;

public class PolymorphismBank {
	public static void main(String args[]){  
		Bank b = new Bank();
		Sbi s=new Sbi();  
		Icici i=new Icici();  
		Axis a=new Axis();  
		System.out.println("Bank Rate of Interest: "+b.getRateOfInterest()); 
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
		}

}
