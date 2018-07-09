package person;

public class Person{
    private String name;
    private int id;

    Person(){}
    Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode(){
        return id * name.hashCode();
    }

    public String getName(){return name;}
    public int getId(){return id;}
}