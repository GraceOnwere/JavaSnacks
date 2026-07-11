package bankApp;

public class Account {

    private final String accountName;
    private int balance;
    private final String pin;
    private final String number;

    public Account(String firstName, String lastName, String accountNumber, String pin){
        this.accountName = firstName + " " + lastName;
        this.number = accountNumber;
        this.pin = pin;
    }
    public int checkBalance(String pin){

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

    public String getAccountNumber(){

        return this.number;
    }

    public String getAccountName(){

        return this.accountName;
    }
}
