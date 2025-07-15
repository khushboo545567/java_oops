// IN JAVA THREAD CAN BE CREATED IN TWO WAYS EXTENDS THREAD AND IMPLEMENTS RUNNABLE INTERFACE

// EXTENDS THREAD
// public class WorldThrd extends Thread{
//     public void run(){
//         System.out.println("World "+Thread.currentThread().getName());
//     }
// }

// IMPLEMENTS RUNNABLE INTERFACE
public class WorldThrd implements Runnable{
    public void run (){
        System.out.println("runnable world "+ Thread.currentThread().getName());
    }
}