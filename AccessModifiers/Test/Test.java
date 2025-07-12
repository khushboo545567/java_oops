package AccessModifiers.Test;

import AccessModifiers.Student.Student;

public class Test{
    public static void main(String[]args){
        Student s1 = new Student();
        s1.age = 12;
        s1.going();

        School.getInstance();
    }
}