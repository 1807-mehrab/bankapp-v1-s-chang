import bank.Bank;
import java.util.*;


public class Main{
    

    public static void main(String[] args){
        Bank theBank = new Bank();
        
        

        
    }

    public int getRandomID(){
        //0-900001
        Random rand = new Random();
        int id = rand(900000) + 100000;
        return id;
    }
}