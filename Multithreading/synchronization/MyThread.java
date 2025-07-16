public class MyThread extends Thread{
    private Counter cnt;
    public MyThread(Counter cnt){
        this.cnt = cnt;
    }
    public void run(){
        for(int i = 0;i<1000;i++){
            cnt.increment();
        }
    }
}