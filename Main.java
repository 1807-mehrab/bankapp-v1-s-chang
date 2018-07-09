import bank.Bank;
import java.util.*;


public class Main{
    

    public static void main(String[] args){
        Bank theBank = new Bank();
        boolean quit = false;
        Scanner sc = new Scanner(System.in);
        String name;
        int ID;
        
        while(!quit){
            if(sc.nextLine() == "quit"){
                quit = true;
            }else{
                System.out.println("Please enter your name: ");
                name = sc.nextLine();
                if(sc.nextLine() == "quit"){
                    quit = true;
                    break;
                }
                //TODO: check randomID for duplicates along with name
                Person p = PersonFactory.getPersonFactory().createPerson(name, getRandomID);

                System.out.println("Please enter your deposit: ");
            }

        }       
    }

    public int getRandomID(){
        //0-900001
        Random rand = new Random();
        int id = rand(900000) + 100000;
        return id;
    }
}