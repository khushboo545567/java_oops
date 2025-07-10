// DOG INHERITS THE PROPERTIES AND BEHAVIOURS OF THE ANIMAL AND CAN OVERRIDE THE BEHAVIOURS AS WELL 
// SO THAT WE DONT HAVE TO WRITE THE SIMILAR PROPERTIES AGAIN AND AGAIN LIKE NAME, AGE ETC. 

public class Dog extends Animal{
   public void makeSound(){
            System.out.println("woooff !");
        }
}