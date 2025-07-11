public abstract class Animal{

    private String name;
    private int age;

    // public void makeSound(){
    //     System.out.println("makes some sound");
    // }

    // the generic methods declared as abstract without body
    // if we dont know the definition of the fun 

    public abstract void makeSound(); // gives error if the method is abstract then class should also be in abstract 

    public void sleep(){
        System.out.println("zzzzz");
    }
}