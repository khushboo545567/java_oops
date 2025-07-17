public class BankAccount{

    private int  balance = 100;
// IN THIS SYNCHRONIZED LOCK WEHN THE THREAD1 COMPLETES EXECUTING THEN ONLY THREAD2 CAN ACCES THIS DATA 
    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+amount);

    if(balance>=amount){
        System.out.println(Thread.currentThread().getName()+"processing with withdraw "+amount);
        try{

        Thread.sleep(3000);
        }catch(InterruptedException e){

        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName()+"compileted withdrawl remaining balance "+balance);
    }else{
         System.out.println(Thread.currentThread().getName()+"insufficient balance"+balance);
    }
    }
}