public class Test{
    public static void main(String[]args){
        // we cant create the object of the abstract class because to initiate there should be body of fun 
        // but we pass the reference of the abstract class 

        Animal dog = new Dog();
        dog.makeSound();
    }
}