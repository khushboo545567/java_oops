class Students{
    String name;
    int age;
    
    public void learn(){
        System.out.println(name + " is studying.");
    }
}
class collegeStudent extends Students{
    String collage;
    String course;
    public void TakeCourse(){
        System.out.println("took course in :"+ course);
    }
}
public class Inheritance{
    public static void main(String []args){
        collegeStudent cs = new collegeStudent();
        cs.name = "khushboo";
        cs.age = 25;
        cs.collage = "RGPV";
        cs.course = "B.tech";
        cs.learn();
        cs.TakeCourse();
    }
}