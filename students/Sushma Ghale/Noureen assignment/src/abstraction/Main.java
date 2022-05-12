package abstraction;

interface Animal1 {

	public void animalSound();//interface method (does not have a body)
	public void sleep();//interface method (does not have a body)
	}


class Pig implements Animal1 {
	public void animalSound(){
	System.out.println ("The Pig says : wee wee");
}
	public void sleep () {
		System.out.println("Zzz");
	}
}
class Main {
public static void main (String []args) {
	Pig myPig = new Pig (); //Create a Pig object
	myPig.animalSound();
	myPig.sleep();
}
}


