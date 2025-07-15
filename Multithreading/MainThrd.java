// WHEN TO USE THREAD = = IF A CLASS IS NOT EXTENDING ANY OTHER CLASS THEN USE THREAD AND 
// IF ONE CALSS IS EXTENDS OTHER CLASS THEN WE CAN NOT EXTENDS ANY OTHER CLASS SO WE HAVE TO IMPLEMENT THE RUNNAVLE INTERFACE


public class MainThrd{
    public static void main(String[]args){
        // EXTENDS THREAD
        // WorldThrd thrd = new WorldThrd();
        // thrd.start();


        // IMPLEMENTS RUNNABLE INTERFACE
        WorldThrd runnablethrd = new WorldThrd();
        Thread t1 = new Thread(runnablethrd);
        t1.start();

        System.out.println("Hellow "+ Thread.currentThread().getName());

    }
}