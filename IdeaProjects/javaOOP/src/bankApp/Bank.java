package bankApp;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final String name;
    private int count;
    private final List<Account> accounts = new ArrayList<>();

    public Bank(String bankName){

        this.name = bankName;
    }

    private String generateAccountNumber(){
        ++count;
        return this.count + "";
    }

    public Account registerCustomer(String firstName, String lastName,String pin){

        String accountNumber = generateAccountNumber();
        Account customer = new Account(firstName,lastName,accountNumber,pin);
        this.accounts.add(customer);

        return customer;
    }

    private Account findAccount(String accountNumber){

        for(Account account: accounts){

            boolean accountNumberIsAMatch = account.getAccountNumber().equals(accountNumber);

            if(accountNumberIsAMatch){

                return account;
            }
        }

//        throw new IllegalArgumentException("Account Number not found");
        return null;
    }

    public void deposit(int amount, String accountNumber){

        Account account = findAccount(accountNumber);
        if (account == null) throw new IllegalArgumentException("Account Number not found");

        account.deposit(amount);
    }

    public void withdraw(int amount,String accountNumber,String pin){

        Account account = findAccount(accountNumber);
        if (account == null) throw new IllegalArgumentException("Account Number not found");

        account.withdraw(amount,pin);

    }

    public void transfer (String senderAccountNumber,int amount,String receiverAccountNumber,String pin){

        Account sender = findAccount(senderAccountNumber);
        if (sender == null) throw new IllegalArgumentException("Account Number not found");

        Account receiver = findAccount(receiverAccountNumber);
        if (receiver == null) throw new IllegalArgumentException("Account Number not found");

        sender.withdraw(amount,pin);
        receiver.deposit(amount);
    }

    public int checkBalance(String accountNumber, String pin){

        Account account = findAccount(accountNumber);
        if (account == null) throw new IllegalArgumentException("Account Number not found");

        return account.checkBalance(pin);
    }

    public void removeAccount(String accountNumber,String accountName){

        Account account = findAccount(accountNumber);
        if (account == null) throw new IllegalArgumentException("Account Number not found");


        if(account.getAccountName().equalsIgnoreCase(accountName)){

            accounts.remove(account);
        }
        else throw new IllegalArgumentException("Account not found");
    }

    public int getSize(){

        return accounts.size();
    }
}