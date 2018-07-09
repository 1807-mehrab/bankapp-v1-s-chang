package person;

public class PersonFactory{
    private PersonFactory pf = null;
    
    private PersonFactory(){ }

    public PersonFactory getPersonFactory(){
        if(pf == null){
            pf = new PersonFactory();
        }

        return pf;
    }

    public Person createPerson(String name, int id){
        return new Person(name, id);
    }
}