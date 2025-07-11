// RUNTIME TIME POLYMORPHISM IS ACHIEVED BY INHERITANCE BY METHOD OVERRIDING 
// POLYMORPHISM = REFRENCE OF THE PARENT AND CREATE THE OBJ OF THE CHILD  
// OVERRIDDEN METHOD IS CALLED ONLY OTHERWISE IT WILL GIVE AN ERROR THAT METHOD NOT FOUDN 
// IT DESIDES WHICH METHOD TO CALL IN RUNTIME LIKE IN CASE OF DOG IT CALL THE DOGS METHOD BECAUSE OBJ OF DOG 

public class Test{
    public static void main(String[]args){
        Animal dog = new Dog();
        dog.makeSound();

        dog.says(); // it gives error because this method is not present in the Animal class // or we can say that this mehtod is not overriden
    }
}