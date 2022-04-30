package PracticeStudent;
import java.util.Scanner;
public class ProductDetails {
	Scanner sc = new Scanner(System.in);

	ProductDaoImpl daoImpl = new ProductDaoImpl();

	public void stuMenu()

	{
		while (true) {
			System.out.println("*************************************************");

			System.out.println("           1)AddProduct                          ");
			System.out.println("           2)ViewAllProduct                          ");
			System.out.println("           3)ViewProduct                          ");
			System.out.println("           4)deleteProduct                          ");
			System.out.println("           5)UpdateProduct                                         ");
			System.out.println("           6)Back                          ");

			System.out.println("*************************************************");

			System.out.println("Enter The Choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				daoImpl.addProducts();
				break;
			case 2:
				Product[] viewAllProducts = daoImpl.viewAllProducts();

				System.out.println("*************************************************");
				System.out.println("PID \t PNAME \t PRICE");
				System.out.println("*************************************************");
				if (viewAllProducts != null) {
					for (Product stu : viewAllProducts) {
						if (stu != null)
							System.out.println(stu.getPid() + "\t" + stu.getPname() + "\t" + stu.getPrice());
					}
				} // end of if
				else
					System.out.println("Records Not found");
				break;
			case 3:
				System.out.println("Enter Product Id");
				Product stu = daoImpl.viewProduct(sc.nextInt());
				System.out.println("*************************************************");
				System.out.println("PID \t PNAME \t PRICE");
				System.out.println("*************************************************");

				if (stu != null)
					System.out.println(stu.getPid() + "\t" + stu.getPname() + "\t" + stu.getPrice());
				else
					System.out.println("Given Record Not Found");
				break;
			case 4:
				System.out.println("Enter Product ID");
				daoImpl.delete(sc.nextInt());
				break;
			case 5:
				System.out.println("Enter Product ID");
daoImpl.update(sc.nextInt());
break;
				
			case 6:
				
				ProductClient.main(null);
				break;

			default:
				System.out.println("Choose 1 to 4 Between");

			}// end of switch

		} // end of while
	}
}
