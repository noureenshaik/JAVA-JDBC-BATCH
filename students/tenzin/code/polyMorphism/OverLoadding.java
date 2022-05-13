class Pattern{
	public void printStar() {
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
	}
	public void printAny(char symbol) {
		for(int i=0;i<10;i++) {
			System.out.print(symbol);
		}
	}
}
public class OverLoadding {

	public static void main(String [] args) {

		Pattern p=new Pattern();
		p.printStar();
		p.printAny('z');
	}
}
