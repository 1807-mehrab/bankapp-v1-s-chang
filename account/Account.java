package account;

import Bank.Calculator;

public abstract class Account{
    private double balance;
    
    Account(){
        balance = 0.0;        
    }

    Account(double initialDeposit){
        balance = initialDeposit;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public abstract double fees();
}