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
        
        FileWriter fw = null;
        try(fw = new FileWriter(filename)){
           fw.write(p.getName() + " " + p.getId() + " " + a.getBalance() + " " + accountType + "\n");
           fw.flush();
        }catch(IOException ex){
           ex.printStackTrace();    
        }
        
    }

    public void seeAccountList(){
       
    }

    public void loadAccountList(){
        FileReader fr = null;
        try(fr = new FileReader(filename)){
            int i;
            while((i = fr.read()) != -1){
                
            }
       }catch(FileNotFoundException ex){
           ex.printStackTrace();
       }catch(IOException ex){
           ex.printStackTrace();    
        }
        fr.close();
    }
}