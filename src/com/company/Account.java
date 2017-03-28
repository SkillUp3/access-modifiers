package com.company;

import java.util.ArrayList;

/**
 * Created by idejesus on 27/03/2017.
 */
public class Account {
    public int getBalance() {
        return balance;
    }

    protected int balance = 0;
    protected ArrayList<Integer> transactions;
    private String accountName;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public void deposit(int amount){
        if(amount >0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println((amount + " deposited. Balance is now " + this.balance));
        }else{
            System.out.println("Cannot deposit negative sums");
        }
    }

    public  void withdraw(int amount){
        int withdrawal = -amount;
        if(withdrawal < 0){
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }else{
            System.out.println("Cannot withdraw negative sums");
        }
    }
    public  void calculateBalance(){
        this.balance = 0;
        for(int i :this.transactions){
            this.balance += i;
        }
        System.out.println("Calculated balance is" + this.balance);
    }
}
