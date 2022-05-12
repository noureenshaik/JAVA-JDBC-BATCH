
public abstract class car {

	abstract void Accelerate();
	
}

class suzuki extends car{

	@Override
	void Accelerate() {
		System.out.println("Acceleration started");
	}
	
}
class main{
	public static void main(String [] args) {
		car c=new suzuki();
		
		c.Accelerate();
	}
}
