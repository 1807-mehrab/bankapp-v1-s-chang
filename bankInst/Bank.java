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
    private final String filename = "AccountList.txt";
    
    public Bank(){
        personData = new HashMap<>();
        accountData = new HashMap<>();
        accountTypeData = new HashMap<>();      
    }

    public void addNewAccount(Person p, Account a, String accountType){
        int hash = p.getHashCode();
        personData.put(hash, p);
        accountData.put(hash, a);
        accountTypeData.put(hash, accountType);           
        System.out.println("Welcome " + p.getName() + " to the Bank.");
    }

    public void seeAccountList(){
        Set<Integer> keys = personData.keySet();
        for(Integer k : keys){
            System.out.println(k + ": " + personData.get(k).getName() + " " + 
                            personData.get(k).getId() + " " + accountData.get(k).getBalance() + " " +
                            accountTypeData.get(k));
        }
    }

    public void loadAccountList(){
        FileReader fr = null;
        try(fr = new FileReader(filename)){
            int i;
            while((i = fr.read()) != -1){
                //TODO: load data from file
            }
       }catch(FileNotFoundException ex){
           ex.printStackTrace();
       }catch(IOException ex){
           ex.printStackTrace();    
        }
        fr.close();
    }

    public void saveAccountList(){
        FileWriter fw = null;
        try(fw = new FileWriter(filename)){
           fw.write(p.getName() + " " + p.getId() + " " + a.getBalance() + " " + accountType);
        }catch(IOException ex){
           ex.printStackTrace();    
        }        
        fw.close();
    }

    public void depositMoney(String name, Integer id, double amount){
        boolean found = false;
        int hash = name.getHashCode() * id;
        Set<Integer> keys = personData.keySet();
        for(Integer k : keys){
            if(k == hash){
                found = true;
            }
        }

        if(found){
            System.out.println(name + " found.  Depositing $" + amount + " to your account." );
            double newBalance = Calculator.depositMoney(amount, accountData.get(hash)).getBalance());
            accountData.get(hash).setBalance(newBalance);
            System.out.println("New balance is: " + accountData.get(hash)).getBalance());
        }else{
            System.out.println(name + " not found. Please try again.");
        }
    }

    public void withdrawMoney(String name, Integer id, double amount){
        boolean found = false;
        int hash = name.getHashCode() * id;
        Set<Integer> keys = personData.keySet();
        for(Integer k : keys){
            if(k == hash){
                found = true;
            }
        }

        if(found){
            if(Calculator.canWithdraw(amount, accountData.get(hash).getBalance(), accountData.get(hash).fees())){
                System.out.println(name + " found.  Withdrawing $" + amount + " plus " + accountData.get(hash).fees() + "from your account." );
                double newBalance = Calculator.withdrawMoney(amount, accountData.get(hash)).getBalance(), accountData.get(hash).fees());
                accountData.get(hash).setBalance(newBalance);
                System.out.println("New balance is: " + accountData.get(hash)).getBalance());
            }else{
                System.out.println(name + " found. Insufficient funds.  Withdrawal canceled.");
            }           
        }else{
            System.out.println(name + " not found. Please try again.");
        }
    }
}