class Adder{
	public int Add(int a,int b) {
		return a+b;
	}
	public int Add(int a,int b,int c) {
		return a+b+c;
	}
}
public class MethodOverloading {
	public static void main(String [] args) {
		Adder ad=new Adder();
		System.out.println("the sum of two parameter is "+ad.Add(10, 20));
		System.out.println("the sum of three parameter is "+ad.Add(30, 40,50));
	}

}
