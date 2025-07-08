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