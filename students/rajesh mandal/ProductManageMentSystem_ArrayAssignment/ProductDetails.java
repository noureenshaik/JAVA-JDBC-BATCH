package com.takeo.details;

import java.util.Scanner;
import com.takeo.client.ProductClient;
import com.takeo.dao.impl.ProductDaoImpl;
import com.takeo.model.Product;

public class ProductDetails {

	Scanner sc = new Scanner(System.in);

	ProductDaoImpl daoImpl = new ProductDaoImpl();

	public void productMenu()

	{
		while (true) {
			System.out.println("*************************************************");

			System.out.println("           1)AddProducts                          ");
			System.out.println("           2)ViewAllProducts                         ");
			System.out.println("           3)Viewproduct                          ");
			System.out.println("           4)deleteProduct                          ");
			System.out.println("           5)UpdateProduct                        ");
			System.out.println("           6)buyProduct                        ");
			System.out.println("           7)Back                          ");

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
				System.out.println("PID \t PNAME \t QTY \t PRICE");
				System.out.println("*************************************************");
				if (viewAllProducts != null) {
					for (Product p1 : viewAllProducts) {
						if (p1 != null)
							System.out.println(p1.getPid() + "\t" + p1.getPname() + "\t" + p1.getPid()+"\t"+p1.getPrice());
					}
				} // end of if
				else
					System.out.println("Records Not found");
				break;
			case 3:
				System.out.println("Enter Product Number");
				Product p1 = daoImpl.viewProducts(sc.nextInt());
				System.out.println("*************************************************");
				System.out.println("PID \t PNAME \t QTY \t PRICE");
				System.out.println("*************************************************");

				if (p1!= null)
					System.out.println(p1.getPid() + "\t" + p1.getPname() + "\t" + p1.getPid()+"\t"+p1.getPrice());
				else
					System.out.println("Given Record Not Found");
				break;
			case 4:
				System.out.println("Enter Product pid Number");
				daoImpl.delete(sc.nextInt());
				break;
			case 5:
				System.out.println("Enter product pid Number");
				daoImpl.update(sc.nextInt());
				break;
			case 6:
				System.out.println("How many product you want to buy");
				daoImpl.buyProduct(sc.nextInt());

			case 7:

				ProductClient.main(null);
				break;

			default:
				System.out.println("Choose 1 to 7 Between");

			}// end of switch

		} // end of while
	}
}
