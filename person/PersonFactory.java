package person;

public class PersonFactory{
    public static PersonFactory pf = null;
    
    private PersonFactory(){ }

    public static PersonFactory getPersonFactory(){
        if(pf == null){
            pf = new PersonFactory();
        }

        return pf;
    }

    public Person createPerson(String name, int id){
        return new Person(name, id);
    }
}