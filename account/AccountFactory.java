package account;

public class AccountFactory{
    private AccountFactory af = null;

    private AccountFactory(){}

    public AccountFactory getAccountFactory(){
        if(af == null){
            af = new AccountFactory();
        }
        return af;
    }

    public Account createAccount(double deposit, String type){
        if(type == "Savings"){
            return new Savings(deposit);        
        }else{
            return new Checking(deposit);
        }
    }   
}