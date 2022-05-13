
 abstract class main1 {

	public abstract void animalSound();
	public void sleep() {
		System.out.println("zzzzzz");
	}
}
class pig extends main1{

	@Override
	public void animalSound() {
		System.out.println("the pig say wee wee");
	}
}
	public class Animal{

		public static void main(String [] args) {
			pig p = new pig();
			p.animalSound();
			p.sleep();
		}
	}

