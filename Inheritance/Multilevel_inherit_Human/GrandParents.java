// MULTILEVEL INHERITANCE

public class GrandParents{
    private String name;
    private int age ;
    
    public GrandParents(){
        System.out.println("grandparents constructor is called");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getage(){
        return age;
    }
}

// Hierarchical Inheritance means multiple classes inherits form the same class;

