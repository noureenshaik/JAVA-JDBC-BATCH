package com.example.demoProject.Polymorphism.OverRidingMethod;

public class MainClass {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank bankOfAmerica = new BankOfAmerica();
        Bank citizenBank = new CitizenBank();
        System.out.println(bank.getInterestRate());
        System.out.println(bankOfAmerica.getInterestRate());
        System.out.println(citizenBank.getInterestRate());
    }
}
