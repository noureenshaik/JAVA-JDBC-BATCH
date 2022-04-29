package com.takeo.dao.impl;

import java.util.Scanner;

import com.takeo.model.Product;

public class ProductDaoImpl {

	Scanner sc = new Scanner(System.in);

	static Product product[] = null;

	public void addProducts() {

		System.out.println("How Many Product would you like to add ?");
		int size = sc.nextInt();
		product = new Product[size];

		for (int i = 0; i < size; ++i) {
			System.out.println("Enter product pid Number ");
			int pid = sc.nextInt();
			System.out.println("Enter product Name ");
			String pname = sc.next();
			System.out.println("Enter product quantity");
			int qty = sc.nextInt();
			System.out.println("Enter the product price");
			int price = sc.nextInt();
			
			Product p1 = new Product(pid, pname,qty,price);
			product[i] = p1;
			System.out.println("Product Record Added Success Fully");

		} // end of for loop

	}// end of addProduct();

	public Product[] viewAllProducts() {

		return product;
	}// end of viewAll Products

	public Product viewProducts(int pid) {
		if (product != null) {
			for (Product p1 : product) {

				if (p1. getPid() == pid) {
					return p1;
				}
			}
		}
		return null;
	}// end of viewProduct

	public void delete(int pid) {

		int j = 0;
		int k = 0;
		if (product != null) {
			for (Product p1 : product) {

				if (p1.getPid() == pid) {

					product[k] = null;
					System.out.println("Record is deleted SuccessFully");
					++j;
					break;
				}
				++k;
			}

		} else {
			System.out.println("Records not exist");
		}
		if (j == 0)
			System.out.println("Given Record Not Found");

	}// end of delete Method

	public void update(int pid) {

		int j = 0;
		if (product != null) {
			for (Product p1 : product) {
				if (p1.getPid() == pid) {
					++j;
					System.out.println("Do You Want to update 1)product Name 2)product qty");
					System.out.println("Enter The Choice");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter product Name");
						String name = sc.next();
						p1.setPname(name);// updating a name
						System.out.println("Product Name updated SuccessFully");
						break;
					case 2:
						System.out.println("Enter Student Qty");
						int qty = sc.nextInt();
						p1.setQty(qty);
						System.out.println("Product quantity is updated SuccessFully");
						break;
					default:
						System.out.println("Choose 1 to 2 between ");
					}// end of switch

				} // end of if

			}

		} // end of if
		else {
			System.out.println("Records are Not Exisit");
		}

		if (j == 0)
			System.out.println("Given Record Not Found");

	}// end of update
	public void buyProduct(int pid) {
		int j = 0;
		if(product!=null) {
			for(Product p1 :product) {
				if(p1.getPid()==pid) {
					System.out.println("Enter Product Quantity");
					int quantity =sc.nextInt();
					int quantity1= p1.getQty();
					int quantity2 = quantity1-quantity;
					p1.setQty(quantity2);
					System.out.println(quantity2);
					System.out.println("Successfully buy the product");
					
				}
			}
		}
		
		
	}

}
