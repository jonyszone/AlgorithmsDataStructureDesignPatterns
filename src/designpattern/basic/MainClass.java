package designpattern.basic;

public class MainClass {

    public static void main(String[] args) {
        var balance = new BankAccount();
balance.depositBalance(1000);
balance.withDrawBalance(50);

        System.out.println(balance.getBalance());
    }
}
