public class BanckAccount{
    private long accountNumber ;
    private double balance;

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposited amount :"+ amount);
        }
        else{
            System.out.println("INVALID AMOUNT"+ amount);
        }
    }
    public void widthdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("withdraw amount :"+amount);
        }else{
            System.out.println("INVALID AMOUNT OR INSUFFICIENT AMOUNT");
        }

    }
    public void setackNO(long accNo){
        this.accountNumber = accNo;
    }
    public double  getBalance(){
        return balance;
    }
}