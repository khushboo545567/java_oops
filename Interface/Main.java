// interface is the blue print of the class 
// pure abstraction and multiple inheritance is acchieved 
// BY DEFAULT the methods and var are public static and final 
// the static and default method is also allowed
// no obj and no constructor is created for the interface because there is no sence of create the obj becasue there is nothing to inilize
// it can only have abstract methods and constants only 

public class Main{
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        Animal cat = new Cat();
        cat.sleep();
        // STATIC METHOD
        Animal.info();
        // DEFAULT METHOD
        dog.run();

    }
}