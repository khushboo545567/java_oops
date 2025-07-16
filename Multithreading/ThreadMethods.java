// public class ThreadMethods extends Thread {

//     // run method //sleep //join 
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             try {
//                 System.out.println("Child thread: " + i);
//                 Thread.sleep(2000);
//             } catch (InterruptedException e) {
//                 throw new RuntimeException(e); // ✅ lowercase "throw"
//             }
//         }
//     }

//     public static void main(String[] args) throws InterruptedException { // ✅ lowercase "throws"
//         ThreadMethods obj = new ThreadMethods();
//         obj.start();  // Starts the new thread

//         // obj.join();   // Main thread waits until obj thread finishes

//         obj.interrupt();

//         System.out.println("Main thread: Hello");
//     }
// }

// yield method == it gives hints to the os sheduler to give to the chace to the other thread
public class ThreadMethods extends Thread{
    public void run(){
        for(int i = 1;i<=5;i++){
            System.out.println("hellow "+Thread.currentThread().getName()+" "+i);
            Thread.yield();
        }
    }
    public static void main(String[]args){
        ThreadMethods obj1 = new ThreadMethods();
        ThreadMethods obj2 = new ThreadMethods();
        obj1.start();
        obj2.start();
    }
}
