// DOG INHERITS THE PROPERTIES AND BEHAVIOURS OF THE ANIMAL AND CAN OVERRIDE THE BEHAVIOURS AS WELL 
// SO THAT WE DONT HAVE TO WRITE THE SIMILAR PROPERTIES AGAIN AND AGAIN LIKE NAME, AGE ETC. 

public class Dog extends Animal{
    @override   //this is called annotation if this is not override then it will give the error message when the function name is not same;
    
   public void makeSound(){
            System.out.println("woooff !");
    }
}