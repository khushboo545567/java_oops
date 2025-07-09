// Encapsulation is wrapping data and methods into one unit and restricting access to internal variables using private access and public getter/setter methods.

public class Student{
    private String name;
    private int rollNo;
    private int age;
    // and restricting direct access to some of the object’s components.
    // make these variable private so that other class can not modify this variable 
    // and make method public 

    public void setAge(int age){
        if(age<0){
            age = 0;
        }
        this.age = age;
    }
    public int  getAge(){
        return this.age;
    }
}