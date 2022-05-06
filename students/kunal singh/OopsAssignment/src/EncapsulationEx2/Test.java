package EncapsulationEx2;

//A Java class to test the encapsulated class Account.
public class Test {
    public static void main(String[] args) {
        //creating instance of Account class
        Account acc = new Account();
        //setting values through setter methods
        acc.setAcc_no(7560504000L);
        acc.setName("manoj");
        acc.setEmail("manoj@gmail.com");
        acc.setAmount(99f);
        //getting values through getter methods
        System.out.println(acc.getAcc_no() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}
