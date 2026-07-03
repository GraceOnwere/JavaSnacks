package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    private Account graceAccount;

    @BeforeEach
    public void setUp(){
        graceAccount = new Account();
    }

    @Test
    public void balanceIsEmpty_balanceIsZeroTest() {

        int balance = graceAccount.getBalance();

        assertEquals(0, balance);
    }

    @Test
    public void balanceIsEmpty_deposit200Test(){

        graceAccount.deposit(200);

        int balance = graceAccount.getBalance();

        assertEquals(200, balance);
    }

    @Test
    public void balanceIsEmpty_depositMinus50Test(){

        graceAccount.deposit(-50);

        int balance = graceAccount.getBalance();

        assertEquals(0, balance);
    }

    @Test
    public void balanceIsEmpty_deposit200and500Test() {

        graceAccount.deposit(200);
        graceAccount.deposit(500);

        int balance = graceAccount.getBalance();

        assertEquals(700, balance);
    }

    @Test
    public void balanceIsEmpty_withdraw200Test(){

        graceAccount.withdraw(200);

        int balance = graceAccount.getBalance();

        assertEquals(0,balance);
    }

    @Test
    public void balanceIsEmpty_withdrawMinus200Test(){

        graceAccount.withdraw(200);

        int balance = graceAccount.getBalance();

        assertEquals(0,balance);
    }

    @Test
    public void deposit500_withdraw200Test(){

        graceAccount.deposit(500);
        graceAccount.withdraw(200);

        int balance = graceAccount.getBalance();

        assertEquals(300,balance);
    }

    @Test
    public void deposit500_withdraw200and300Test(){

        graceAccount.deposit(500);
        graceAccount.withdraw(200);
        graceAccount.withdraw(300);

        int balance = graceAccount.getBalance();

        assertEquals(0,balance);
    }

    @Test
    public void deposit500_withdraw1000Test(){

        graceAccount.deposit(500);
        graceAccount.withdraw(1000);

        int balance = graceAccount.getBalance();

        assertEquals(500,balance);
    }


}
