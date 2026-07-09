package bankApp;

public class Account {

    private String accountName;
    private int balance;
    private final String pin;

    public Account(String pin){
        this.pin = pin;
    }
    public int getBalance(String pin){

        if(!isPinValid(pin)) throw new IllegalArgumentException("Invalid Pin");

        return balance;
    }

    public void deposit(int amount) {
        boolean amountIsPositive = amount > 0;

        if (amountIsPositive) {
            balance = balance + amount;
        }
    }

    private boolean isPinValid(String pin){
        return this.pin.equals(pin);
    }

    public void withdraw(int amount, String pin) {

        boolean amountToWithdrawIsValid = amount > 0 && amount <= balance;

        if(isPinValid(pin) && amountToWithdrawIsValid){

            balance = balance - amount;
        }

        else if (!isPinValid(pin)) throw new IllegalArgumentException("Invalid Pin");

        else throw new IllegalArgumentException("Invalid Amount");

    }

}
