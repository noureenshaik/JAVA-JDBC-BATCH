
class Bank{
	int getInterest() {
		return 0;
	}	
}
class PrabhuBank extends Bank{
	int getInterest() {
		return 8;
	}
}
class NabilBank{
	int getInterest() {
		return 10;
	}
}
public class MethodOverRiding {
	public static void main(String [] args) {
		PrabhuBank pb=new PrabhuBank();
		NabilBank nb=new NabilBank();
		
		System.out.println("The Interest Rate of Prabhu Bank is "+pb.getInterest());
		System.out.println("The Interest Rate of Nabil Bank is "+nb.getInterest());
	}

}
