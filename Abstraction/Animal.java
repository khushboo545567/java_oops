public abstract class Animal{

    private String name;
    private int age;

    // public void makeSound(){
    //     System.out.println("makes some sound");
    // }

// WE CAN CREATE THE CONSTRUCTOR OF THE ABSTRACT CLASS

protected Animal();

    // the generic methods declared as abstract without body
    // if we dont know the definition of the fun 

// make this protected so that it is accessable only inside this package only but it can be overridden in the other package 
    protected abstract void makeSound(); // gives error if the method is abstract then class should also be in abstract 

    public void sleep(){
        System.out.println("zzzzz");
    }
}