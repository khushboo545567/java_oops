// USE CASE OF STATIC == make a utils package and create static mathods like max, min , touppercase etc, and use this methods whenever required by their class name (utils.max(5,6) and utils.toupercase("hellow")) 

public class Student{

    private String name;
    private int age;

// this is access by the class name;
    public static int count = 0;

    static{
        // STATIC BLOCK IS USED TO INILIZE THE STATIC VARIABLE ONE TIME STATIC INILIZATION
        count = 22;
    }

    public Student(){
        count++;
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
    public int getAge(){
        return age;
    }

// IN STATIC METHOD WE USE ONLY STATIC VARIABLE 
    public static void setCount(){
        System.out.println("the number of students is :"+count);
        System.out.println("the age of the studnet is :"+age); // ERROR because the age is particular to the student not a general term associated with obj
        // THIS AND SUPER CAN NOT BE USED BEACUSE THESE POINTS TO THE OBJ AND THE PARENT CLASS
    }
}