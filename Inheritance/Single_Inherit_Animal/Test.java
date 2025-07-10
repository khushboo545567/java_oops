public class Test{
    public static void main(String[]args){
        Dog d1 = new Dog();

        // HERE APPLIED ENCAPSULATION AS WELL SO THAT NO ONE CAN ACCESS THE DATA FIELDS DIRECTLY BUT THROUGH GETER AND SETTERS ONLY

        d1.SetName("bob");
        d1.setAge(12);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        d1.eat();
        d1.makeSound(); // get overridden method form the dog 
    }
}