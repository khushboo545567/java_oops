public class MainBank{
    public static void main(String[]args){
        BankAccount b1 = new BankAccount();
        Runnable task = new Runnable(){
            public void run(){
            b1.withdraw(50);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}