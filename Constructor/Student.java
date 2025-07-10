public class Student{
    String name;
    int rollNo ;
    int age;

    // COSNTRUCTOR IS USED TO INILIZE THE OBJECT;
    // IF THERE IS NO CONSTRUCTOR THEN DEFAULT CONSTRUCTOR IS CALLED OTHER WISE PARAMERIZED CONSTRUCTOR IS CALLED
    
    public Student(String name,int roll,int age){
        this.name = name;
        this.rollNo = roll;
        this.age= age;
    }
}