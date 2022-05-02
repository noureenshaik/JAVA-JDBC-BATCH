package PracticeStudent;
import java.util.Scanner;
public class ProductDaoImpl {
	Scanner sc = new Scanner(System.in);

	static Product product[] = null;

	public void addProducts() {

		System.out.println("How many products are you adding ?");
		int size = sc.nextInt();// 3
		product = new Product[size];

		for (int i = 0; i < size; ++i) {
			System.out.println("Enter Product Id ");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name ");
			String pname = sc.next();
			System.out.println("Enter Product Price");
			int price = sc.nextInt();

			Product stu = new Product(pid, pname, price);
			product[i] = stu;
			System.out.println("Product Added Success Fully");

		} // end of for loop

	}// end of addProducts();

	public Product[] viewAllProducts() {

		return product;
	}// end of viewAll Products

	public Product viewProduct(int pid) {
		if (product!= null) {
			for (Product stu : product) {

				if (stu.getPid() == pid) {
					return stu;
				}
			}
		}
		return null;
	}// end of viewProduct

	public void delete(int pid) {

		int j = 0;
		int k = 0;
		if (product != null) {
			for (Product stu : product) {

				if (stu.getPid() == pid) {

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
			for (Product stu : product) {
				if (stu.getPid() == pid) {
					++j;
					System.out.println("Do You Want to update 1)Product Name 2)ProductAddress");
					System.out.println("Enter The Choice");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter Product Name");
						String name = sc.next();
						stu.setPname(name);// updating a name
						System.out.println("Product Name updated SuccessFully");
						break;
					case 2:
						System.out.println("Enter Product Price");
						int price = sc.nextInt();
						stu.setPrice(price);
						System.out.println("Product Price is updated SuccessFully");
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

}
