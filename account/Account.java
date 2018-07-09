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

    public void depositMoney(double deposit){
        balance = Calculator.depositMoney(deposit, balance);
    }

    public void withdrawMoney(double withdraw){
        totalMoney = Calculator.withdrawMoney(withdraw, balance);
    }

    public double getBalance(){
        return balance;
    }

    public abstract double fees();
}