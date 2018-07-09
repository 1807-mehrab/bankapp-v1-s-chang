package Bank;

public static class Calculator{
    Calculator(){ }

    public static double depositMoney(double deposit, double totalMoney){
        return totalmoney + deposit;
    }

    public static double withdrawMoney(double withdraw, double totalMoney){
        return totalMoney - withdraw;
    }

    public static double checkBalance(){
        return totalMoney;
    }

    public static boolean canWithdraw(double withdraw, double totalMoney){
        return totalMoney > withdraw;
    }
}