class Language{
	public void displayInfo() {
		System.out.println("This is Language");
	}
}
class Java extends Language{
	@Override
	public void displayInfo() {
		System.out.println("this is java programming language");
	}
}

public class PolyOverriding {
	public static void main(String [] args) {
		Java j=new Java();
		j.displayInfo();
		Language l=new Language();
		l.displayInfo();
	}

}
