package bankinst;

public static class Calculator{
    Calculator(){ }

    public static double depositMoney(double deposit, double totalMoney){
        return totalmoney + deposit;
    }

    public static double withdrawMoney(double withdraw, double totalMoney, double fees){
        return totalMoney - withdraw - fees;
    }

    public static boolean canWithdraw(double withdraw, double totalMoney, double fees){
        return totalMoney > (withdraw + fees);
    }

    //public static double savingsFee(double totalMoney){
    //    return totalMoney - 5.0;
    //}
}