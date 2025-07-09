public class TestBank{
    public static void main(String[]args){

    BanckAccount accouont1 = new BanckAccount();
    accouont1.setackNO(45678923);
    accouont1.deposit(1000000);
    accouont1.widthdraw(100000);
    double balance = accouont1.getBalance();
    System.out.println(balance);
    }
}