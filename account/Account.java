package account;

import Bank.Calculator;

class Account{
    private double totalMoney;
    
    Account(){
        totalMoney = 0.0;        
    }

    Account(double initialDeposit){
        totalMoney = initialDeposit;
    }

    public void depositMoney(double deposit){
        totalMoney = Calculator.depositMoney(deposit, totalMoney);
    }

    public void withdrawMoney(double withdraw){
        totalMoney = Calculator.withdrawMoney(withdraw, totalMoney);
    }

    public double getTotalMoney(){
        return totalMoney;
    }
}