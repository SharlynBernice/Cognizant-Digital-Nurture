import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {

        account = new BankAccount(1000);

        System.out.println("Test Started");

    }

    @AfterEach
    void tearDown() {

        System.out.println("Test Completed");

    }

    @Test
    void testDeposit() {

        account.deposit(500);

        assertEquals(1500, account.getBalance());

    }

    @Test
    void testWithdraw() {

        account.withdraw(300);

        assertEquals(700, account.getBalance());

    }

    @Test
    void testWithdrawException() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> account.withdraw(1500)
        );

        assertEquals("Insufficient balance", exception.getMessage());

    }

    @Test
    void testPositiveBalance() {

        assertTrue(account.getBalance() > 0);

    }

}
