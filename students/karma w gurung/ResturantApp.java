import java.util.Scanner;

public class ResturantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("*****************");
			System.out.println("   1)Momo        ");
			System.out.println("   2)Chowmein    ");
			System.out.println("   3)Drinks      ");
			System.out.println("   4)Bill        ");
			System.out.println("   5)Exit        ");
			
			System.out.println("*****************");

			System.out.println("Enter the choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				MomoDetails details = new MomoDetails();
				details.momo();
				break;
				
			case 2:
				ChowmeinDetails food = new ChowmeinDetails();
				food.chowmein();
				break;
				
			case 3:
				DrinkDetails taste = new DrinkDetails();
				taste.drink();
				break;
				
			
			
			case 4:
				System.out.println("thnx");
				System.exit(0);

			default:
				System.out.println("choose any of your choice");
			}
		}
	}
}
