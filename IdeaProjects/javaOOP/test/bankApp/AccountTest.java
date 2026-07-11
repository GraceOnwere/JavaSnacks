package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account graceAccount;
    private final String pin = "1234";
    private String firstName = "Grace";
    private String lastName = "Onwere";

    @BeforeEach
    public void setUp(){
        graceAccount = new Account(firstName,lastName,"0",pin);
    }

    @Test
    public void balanceIsEmpty_balanceIsZeroTest() {

        int balance = graceAccount.checkBalance(pin);

        assertEquals(0, balance);
    }

    @Test
    public void deposit200_balanceIs200Test(){

        graceAccount.deposit(200);

        int balance = graceAccount.checkBalance(pin);

        assertEquals(200, balance);
    }

    @Test
    public void depositMinus50_balanceIsZeroTest(){

        graceAccount.deposit(-50);

        int balance = graceAccount.checkBalance(pin);

        assertEquals(0, balance);
    }

    @Test
    public void deposit200and500_balanceIs700Test() {

        graceAccount.deposit(200);
        graceAccount.deposit(500);

        int balance = graceAccount.checkBalance(pin);

        assertEquals(700, balance);
    }

    @Test
    public void withdraw200_throwsException_balanceIsZeroTest(){

        assertThrows(IllegalArgumentException.class,()-> graceAccount.withdraw(200,pin));

        assertEquals(0,graceAccount.checkBalance(pin));
    }

    @Test
    public void withdrawMinus200_throwsException_balanceIsZeroTest(){

        assertThrows(IllegalArgumentException.class,()-> graceAccount.withdraw(-200,pin));

        assertEquals(0,graceAccount.checkBalance(pin));
    }

    @Test
    public void deposit500_withdraw200WithCorrectPin_balanceIs300Test(){

        graceAccount.deposit(500);
        graceAccount.withdraw(200,pin);

        int balance = graceAccount.checkBalance(pin);

        assertEquals(300,balance);
    }

    @Test
    public void deposit500_withdraw200WithIncorrectPin_throwsException_balanceIs500Test(){

        graceAccount.deposit(500);

        assertThrows(IllegalArgumentException.class,()-> graceAccount.withdraw(200,"1235"));

        assertEquals(500,graceAccount.checkBalance(pin));
    }

    @Test
    public void deposit500_withdraw200and300Test(){

        graceAccount.deposit(500);
        graceAccount.withdraw(200,pin);
        graceAccount.withdraw(300,pin);

        int balance = graceAccount.checkBalance(pin);

        assertEquals(0,balance);
    }

    @Test
    public void deposit500_withdraw1000_ThrowsExceptionTest(){

        graceAccount.deposit(500);

        assertThrows(IllegalArgumentException.class,()-> graceAccount.withdraw(1000, "1234"));
    }


}
