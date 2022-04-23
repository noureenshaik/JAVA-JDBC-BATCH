package funAssignment;
import java.util.Scanner;

public class ResturantApp {
	
	public static void main(String[] args) {
		int bill=0;
		while (true) {
		System.out.println("-----RESTURANT MENU-----");
		System.out.println("-----1->BIRYANI-----");
		System.out.println("-----2->DRINKS-----");
		System.out.println("-----3->ICE-CREAM-----");
		System.out.println("-----4->CHECKOUT-----");
		
		
		Scanner sc=new Scanner(System.in);
		
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("\n1.Chicken (rs 100) \n2.Mutton  (rs 150)\n3.Fish  (rs 200)");
			int biryaniChoice=sc.nextInt();
			bill+=Biryani(biryaniChoice);
			System.out.println("Your Total Till Now "+bill);
			break;
			
		case 2:
			System.out.println("1.Hot Drinks \n 2.Cold Drinks");
			int drinksChoice=sc.nextInt();
			if(drinksChoice==1) {
				System.out.println("1.Green Tea (rs 20) \n2.Milk Tea (rs 30)\n3.Black Tea (rs 10)");
				int hotDrinks=sc.nextInt();
				bill+=HotDrinks(hotDrinks);
				System.out.println("Your Total Till Now "+bill);
			}
			else {
				System.out.println("1.Coke,Fanta,Sprite (rs 50) \n 2.smoothie (rs 100) \n 3.milkshake (rs 200)");
				int coldDrinks=sc.nextInt();
				bill+=ColdDrinks(coldDrinks);
				System.out.println("Your Total Till Now "+bill);
				
				
			}
			break;
		case 3:
			System.out.println("1.Vinalla Ice-Cream  (rs 100) \n2.Chocolate Ice-Cream (rs 150) \n 3.Butter Scotch Ice-cream (rs200)");
			int iceCream=sc.nextInt();
			bill+=IceCream(iceCream);
			System.out.println("Your Total Till Now is "+bill);
			
			break;
			
		default: System.out.println("Your Total Bill Is Rs "+bill+"\n THANK YOU VISIT AGAIN !!!!!");
		System.exit(0);
		
			
		}
		
	}
		}
	
	public static int Biryani(int num) {
		switch(num) {
		case 1: return 100;
		
		case 2: return 150;
		
		default:return 200;
		
		}
	}
	public static int HotDrinks(int hotDrinks) {
		switch(hotDrinks) {
		case 1: return 20;
		case 2: return 30;
		default: return 10;
		}
	}
	public static int ColdDrinks(int coldDrinks) {
		switch(coldDrinks) {
		case 1: return 50;
		case 2: return 100;
		default: return 200;
		}
	}
	public static int IceCream(int iceCream) {
		switch(iceCream) {
		case 1: return 100;
		case 2: return 150;
		default: return 200;
		}
	}
	
	
}
