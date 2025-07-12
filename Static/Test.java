public class Test{
    // THIS MAIN METHOD IS STATIC BECAUSE WHEN JVM RUN THIS PROGRAM IT IS NOT REQUIRED TO CREATE THE OBJ OF TEST CLASS IT CAN SIMPLY RUN MAIN MTHOD BY THE CLASS NAME (Test.main);
    
    public static void main(String[]agrs){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        System.out.println(Student.count);
    }
}