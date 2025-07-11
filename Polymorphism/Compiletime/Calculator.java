// COMPILE TIME POLYMORPHISM == IN THIS THE DESION IS TAKEN IN THE COMPILE TIME WHICH METHOD TO CALL 
// THIS IS DONE BY METHOD OVERLOADING 
public class Calculator{

    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b, int c){
        return a+b+c;
    }
    public static double sum (double a,double b){
        return a+b;
    }

    public static void main(String[]args){
        System.out.println(sum(2,4));
        System.out.println(sum(4,5,6));
        System.out.println(sum(2.2,3.2));
    }
}