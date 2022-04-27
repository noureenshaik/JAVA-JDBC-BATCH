import java.util.Scanner;
class Product {
	private int pid;
	private String pname;
	private int qty;
	private int price;
	
	Product(int pid, String pname, int qty, int price){
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public int getQty() {
		return qty;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return pid+ " "+pname+" "+qty+" "+price;
	}
}	
class ProductClient{
		public static void main(String[] args) {
			int ch;
			do {
				System.out.println("1.Product");
				System.out.println("2.Exit");
				System.out.println("press 1 for product or 0 to Exit");
			}
			
		}
	}
	