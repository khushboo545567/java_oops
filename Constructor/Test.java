public class Test{
    public static void main(String[]args){
        // DEFAULT CONSTRUCTOR

        // Student s1 = new Student(); 
        // this is default constructor used to initilize the object it inilizes the default values to the variable 
        // System.out.println(s1.name); //null
        // System.out.println(s1.age); //0

        // PARAMETERIZED CONSTRUCTOR
        // it initilizes the variables with the given value
        
        Student s2 = new Student("khushboo",81,25);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}