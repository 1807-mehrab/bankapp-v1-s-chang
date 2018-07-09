package person;

public class Person{
    private String name;
    private Integer id;
   
    
    Person(){}
    Person(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode(){
        Integer code = id * name.hashCode();
       
        return code.intValue();
    }

    public String getName(){return name;}
    public Integer getId(){return id;}
}