package person;

public class Person{
    private String name;
    private Integer id;
 
    
    Person(){}
    Person(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public String getName(){return name;}
    public Integer getId(){return id;}
}