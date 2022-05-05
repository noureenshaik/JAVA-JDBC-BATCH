
class one {
	void PrintOne() {
		System.out.println("this is one ");
	}
}
class two extends one{
	void PrintTwo() {
		System.out.println("this is two");
	}
}
class three extends two{
	void printThree() {
		System.out.println("this is three");
	}
}
public class SingleInheritance2 {

	public static void main(String[] args) {
		three three=new three();
		three.PrintOne();
		three.PrintTwo();
		three.printThree();
	}

}
