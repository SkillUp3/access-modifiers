package com.company;

public class Main {

    public static void main(String[] args) {
        Account ianAccount = new Account("Ian");
        ianAccount.deposit(1000);
        ianAccount.withdraw(500);
        ianAccount.withdraw(-200);
        ianAccount.deposit(-20);
        ianAccount.calculateBalance();;

//        ianAccount.balance = 5000;
//        System.out.println(ianAccount.getBalance());
//
//        ianAccount.transactions.add(4500);
//        ianAccount.calculateBalance();
    }
}
