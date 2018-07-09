package account;

class Account{
    private double totalMoney;
    
    Account(){
        totalMoney = 0.0;        
    }

    Account(double initialDeposit){
        totalMoney = initialDeposit;
    }

    public void depositMoney(double deposit){
        
    }

    public void withdrawMoney(double withdraw){
        if(totalMoney > withdraw){
            totalMoney -= withdraw;
        }else{
            System.out.println("Insufficient Funds.");            
        }
    }

    public int getTotalMoney(){
        return totalMoney;
    }
}