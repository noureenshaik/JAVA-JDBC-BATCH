import java.util.Scanner;

public class ChowmeinDetails {
	 static int totalChowmein_Bill=0;
	int chikenChowmein_Bill=0;
	int chikenChowmein_price=70;

	void chikenChowmein() {
		System.out.println("how many palte:");
		int plate=sc.nextInt();
		chikenChowmein_Bill=plate*chikenChowmein_price;
		System.out.println(plate +" plate chiken chowmein price :"+chikenChowmein_Bill);
		System.out.println("thank u");
		totalChowmein_Bill=chikenChowmein_Bill;
		System.out.println("Your Total price :"+totalChowmein_Bill);
	}
	int buffChowmein_Bill=0;
	int buffChowmein_price=90;
	
	void buffChowmein() {
		System.out.println("how many palte:");
		int plate=sc.nextInt();
		buffChowmein_Bill=plate*buffChowmein_price;
		System.out.println(plate +" plate buff chowmein price :"+buffChowmein_Bill);
		System.out.println("thank u");
		totalChowmein_Bill=buffChowmein_Bill;
		System.out.println("Your Total price :"+totalChowmein_Bill);
	}
	int veggieChowmein_Bill=0;
	int veggieChowmein_price=60;
	
	void veggieChowmein() {
		System.out.println("how many palte:");
		int plate=sc.nextInt();
		veggieChowmein_Bill=plate*veggieChowmein_price;
		System.out.println(plate +" plate veggie chowmein price :"+veggieChowmein_Bill);
		System.out.println("thank u");
		totalChowmein_Bill=veggieChowmein_Bill;
		System.out.println("Your Total price :"+totalChowmein_Bill);
	}

	Scanner sc = new Scanner(System.in);

	public void chowmein() {
		System.out.println("**********************");
		System.out.println("  1)chiken chowmein   ");
		System.out.println("  2) buff chowmein    ");
		System.out.println("  3) veggie chowmein  ");
		System.out.println("  4)      back        ");
		System.out.println("**********************");

		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			chikenChowmein();
			chowmein();
			break;

		case 2:
			buffChowmein();
			chowmein();
			break;

		case 3:
			veggieChowmein();
			chowmein();
			break;

		case 4:
			ResturantApp.main(null);
		default:
			System.out.println("choose any of your choice");
		}
	}
}