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

    public Account createAccount(double deposit){
        return new Account(deposit);        
    }
}