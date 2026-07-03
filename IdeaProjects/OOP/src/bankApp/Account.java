package bankApp;

public class Account {
    private int balance;

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount) {
        boolean amountIsPositive = amount > 0;

        if (amountIsPositive) {
            balance = balance + amount;
        }
    }

    public void withdraw(int amount) {

        boolean amountToWithdrawIsValid = amount > 0 && amount <= balance;

        if (amountToWithdrawIsValid){
            balance = balance - amount;
        }

    }
}
