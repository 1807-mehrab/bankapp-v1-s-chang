import account.Account;
import account.AccountFactory;
import person.Person;
import person.PersonFactory;
import java.util.Map.*;
import java.io.*;


package bankinst;

public class Bank{
    private Map<Integer, Person> personData;
    private Map<Integer, Account> accountData;
    private Map<Integer, String> accountTypeData;
    final String filename = "AccountList.txt";
    FileWriter fw;
    FileReader fr;

    public Bank(){
        personData = new HashMap<>();
        accountData = new HashMap<>();
        accountTypeData = new HashMap<>();
        try{
            fw = new FileWriter(filename);
            fr = new FileReader(filename);
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        catch(IOException ex){
            ex.printStackTrace();
        }
    }

    public void createAccountList(){
       if()

        
    }

    public void addNewAccount(String name, Integer id, String accountType, double initialDeposit){
        int hash = name.hashCode() * id;
        Person p = PersonFactory.getPersonFactory().createPerson(name, id);
        Account a = AccountFactory.getAccountFactory().createAccout(initialDeposit, accountType);
        personData.put(hash, p);
        accountData.put(hash, a);
        accountTypeData.put(hash, accountType);        
    }

    public void seeAccountList(){
        
    }




   
}