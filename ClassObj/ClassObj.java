// encapsulation (group of the data and methods in a single unit(class) is called encapsulation and data hiding is possible by encapsulation by the private access specifier)

class Car{
    String color;
    int speed;
    int bikeNo;

    public void run(){
        System.out.println("Car is running");
        System.out.println("the color is :"+ color +"and the speed is :"+speed + "and the bike no is :"+bikeNo);
    }
}
public class ClassObj{
    public static void main(String[]args){
        Car c = new Car();
        c.color = "red";
        c.speed = 90;
        c.bikeNo = 789;
        c.run();
    }
}