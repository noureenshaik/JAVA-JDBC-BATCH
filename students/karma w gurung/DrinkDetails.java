import java.util.Scanner;

public class DrinkDetails {
	static int totalBill=0;
	int cocacolaBill=0;
	int cocacola_price=20;
	
	void cocacola() {
		System.out.println("how many drink:");
		int drink=sc.nextInt();
		cocacolaBill=drink*cocacola_price;
		System.out.println(drink +" drink price :"+cocacolaBill);
		System.out.println("thank u");
		totalBill=cocacolaBill;
		System.out.println("Your Total price :"+totalBill);
	}
	
	int orangejuiceBill=0;
	int orangejuice_price=40;
	
	void orangejuice() {
		System.out.println("how many drink:");
		int drink=sc.nextInt();
		orangejuiceBill=drink*orangejuice_price;
		System.out.println(drink +" drink price :"+orangejuiceBill);
		System.out.println("thank u");
		totalBill=orangejuiceBill;
		System.out.println("Your Total price :"+totalBill);
	}
	
	int mineralwaterBill=0;
	int mineralwater_price=10;
	
	void mineralwater() {
		System.out.println("how many drink:");
		int drink=sc.nextInt();
		mineralwaterBill=drink*mineralwater_price;
		System.out.println(drink +" drink price :"+mineralwaterBill);
		System.out.println("thank u");
		totalBill=mineralwaterBill;
		System.out.println("Your Total price :"+totalBill);
	}

	Scanner sc = new Scanner(System.in);

	public void drink() {
		System.out.println("*******************");
		System.out.println("  1)cocacola       ");
		System.out.println("  2)orange juice   ");
		System.out.println("  3)mineral water  ");
		System.out.println("  4)back           ");
		System.out.println("*******************");

		System.out.println("enter the choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			cocacola();
			drink();
			break;

		case 2:
			orangejuice();
			drink();
			break;

		case 3:
			mineralwater();
			drink();
			break;

		case 4:
			ResturantApp.main(null);
		default:
			System.out.println("choose any of your choice");

		}

	}

}
