class Animal{
    void makeSound(){
        System.out.println("make some sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("wooff !");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("meoww !");
    }
}

public class Polymorphism{
    public static void main(String[]args){
    Animal dog = new Dog();
    dog.makeSound();
    Cat c = new Cat(); // this is not polymorphism // this is called method called;
    c.makeSound();
    }
}