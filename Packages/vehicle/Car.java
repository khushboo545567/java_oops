package vehicle;
public class Car{
   public String name; // public is neccessary to access this vaiable form outside of the package;
   public void run (){
        System.out.println("the "+name + " is running .");
    }
}

//  this class(mini class) is not accessable in diffrent package  but it is accessable in the same package to MAKE IT ACCESSABLE move this class to the Car class and make it public OR MOVE THIS CLASS TO THE SEPARATE CLASS

// class MiniCar{

// }

// BEST PRACTICE IS TO MOVE THIS MINICAR CLASS TO THE DIFFERENT FILE WITH MINICAR.JAVA