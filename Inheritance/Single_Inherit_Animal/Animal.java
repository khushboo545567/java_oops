// SINGLE INHERITANCE 

public class Animal{
    private String name;
    private int age;

    public void eat(){
        System.out.println(name + " is eating.");
    }
    public void makeSound(){
        System.out.println("");
    }
    public void SetName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}