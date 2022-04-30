import java.util.Scanner;

public class MomoDetails {
	static int totalMomo_Bill=0;
	int chikenMomo_Bill=0;
	int chikenMomo_price=50;

	void chikenMomo() {
		System.out.println("how many palte:");
		int plate=sc.nextInt();
		chikenMomo_Bill=plate*chikenMomo_price;
		System.out.println(plate +" plate chiken momo price :"+chikenMomo_Bill);
		System.out.println("thank u");
		totalMomo_Bill=chikenMomo_Bill;
		System.out.println("Your Total price :"+totalMomo_Bill);
		
	}
	
	int buffMomo_Bill=0;
	int buffMomo_price=60;

	void buffMomo() {
		System.out.println("how many palte:");
		int plate=sc.nextInt();
		buffMomo_Bill=plate*buffMomo_price;
		System.out.println(plate +" plate buff momo price :"+buffMomo_Bill);
		System.out.println("thank u");
		totalMomo_Bill=buffMomo_Bill;
		System.out.println("Your Total price :"+totalMomo_Bill);
	}
	
	int veggieMomo_Bill=0;
	int veggieMomo_price=35;

	void veggieMomo() {
		System.out.println("how many palte:");
		int plate=sc.nextInt();
		veggieMomo_Bill=plate*veggieMomo_price;
		System.out.println(plate +" plate veggie momo price :"+veggieMomo_Bill);
		System.out.println("thank u");
		totalMomo_Bill=veggieMomo_Bill;
		System.out.println("Your Total price :"+totalMomo_Bill);
	}

	
	
	Scanner sc = new Scanner(System.in);

	public void momo() {
		System.out.println("******************");
		System.out.println("  1)chiken momo   ");
		System.out.println("  2) buff momo    ");
		System.out.println("  3)veggie momo   ");
		System.out.println("  4)    back      ");
		System.out.println("******************");

		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			chikenMomo();
			momo();
			break;

		case 2:
			buffMomo();
			momo();
			break;

		case 3:
			veggieMomo();
			momo();
			break;

		case 4:
			ResturantApp.main(null);
		default:
			System.out.println("choose any of your choice");
		}

	}

}
