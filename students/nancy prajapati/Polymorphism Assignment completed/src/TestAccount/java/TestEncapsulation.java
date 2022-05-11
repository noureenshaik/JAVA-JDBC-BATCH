package TestAccount.java;

import com.javapoint.Account;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating instance of Account class
		Account acc = new Account();

		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setName("Sonoo jaiswal");
		acc.setEmail("sonoojaiswal@javapoint.com");
		acc.setAmount(50000f);

		// getting values through getter methods
		System.out.println(acc.getAcc_no() + "\t " + acc.getName() + " \t" + acc.getEmail() + " \t" + acc.getAmount());

	}

}
