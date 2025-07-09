package animal;
import vehicle.Car;
public class Cat{
    String name ; //this name is accessable in the same package but not in different package to ACCESS MAKE IT PUBLIC 
    void sound(){ // this is same as name;
        System.out.println(name+" make meoww ! souond");
    }
    public static void main(String[]args){
        Car c = new Car();
        c.name = "BMW";
        c.run();
    }
}
