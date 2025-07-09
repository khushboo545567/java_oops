
public class Test{
    public static void main(String[]args){
    Student s1 = new Student();
    // s1.name = "khushboo"; CANT BE SET THE VALUE DIRECTLY 
    s1.setAge(25);
    int age = s1.getAge();
    System.out.println(age);
    }
}