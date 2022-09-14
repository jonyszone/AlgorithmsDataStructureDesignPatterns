package designpattern.basic;


//Encapsulation
public class BankAccount {
     private float balance;

     public void withDrawBalance (float amount) {
         if (amount>0)
            this.balance-= amount;
     }

    public void depositBalance(float amount) {
        if (amount> 0) {
            balance += amount;
        }
    }

    public float getBalance() {
        return balance;
    }
}
