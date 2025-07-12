package AccessModifiers.Student;


public class Student{
    private int age;  //ONLY ACCESSABLE IN THIS CLASS
    public String name;
    
    // PUBLIC IS ACCESSABLE THOUGHTOUT THE PACKAGE AND THE DIFFERENT PACKAGE

// PRIVATE CONSTRUCTOR
private Student(){
    // private cosntructor by this we can not create the obj of this class 
    // there is static keyword also it is used wehn we want to call the methods by the class name not by creating the obj of the class
}

    public void going(){
        System.out.println("student is going to the class");
    } 
}