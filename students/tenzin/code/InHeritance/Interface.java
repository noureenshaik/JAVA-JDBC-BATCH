interface one1{
	public void printOne();
}
interface two2{
	public void printTwo();
}
interface three3 extends one1,two2{
	public void printThree();
}
class child implements three3{

	@Override
	public void printOne() {
		// TODO Auto-generated method stub
		System.out.println("this is one ");
	}

	@Override
	public void printTwo() {
		// TODO Auto-generated method stub
		System.out.println("this is two");
	}

	@Override
	public void printThree() {
		// TODO Auto-generated method stub
		System.out.println("this is three");
	}
	
}
public class Interface {
	public static void main(String [] args) {
		child c=new child();
		c.printOne();
		c.printThree();
		c.printTwo();
	}

}
