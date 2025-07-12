// this Final class can not be extended by any other class 
// THE FINAL KEYWORD IS USED TO RESTRICT THE CHANGES

public  final class Final{
    // THIS CAN NOT BE REASSIGN 
    public final double PI = 3.14; 

    // this method can not be overridden by the subclass;
    // if some other class extends the Final class and want to override taj method then they can not do that 
    public final void taj(){
        System.out.println("The Taj Mahal is in delhi");
    }
}