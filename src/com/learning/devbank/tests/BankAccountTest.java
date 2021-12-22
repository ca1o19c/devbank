package com.learning.devbank.tests;

import com.learning.devbank.domain.BankAccount;
import com.learning.devbank.tests.mock.BankAccountMock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    public void shouldAccountDeposit() {
        var mock = BankAccountMock.aMock();

        assertEquals(mock.getBalance(), 8900);

        mock.deposit(120);

        assertEquals(mock.getBalance(), 9020);
    }

    @Test
    public void shouldAccountWithdraw() {
        var mock = BankAccountMock.aMock();

        mock.withdraw(900);

        var balance = mock.getBalance();

        assertEquals(balance, 8000);
    }

    @Test
    public void shouldNotAccountWithdraw() {
        var mock = BankAccountMock.aMock();

        mock.withdraw(10000);

        var balance = mock.getBalance();

        assertEquals(balance, 8900);
    }

    @Test
    public void shouldRetrievesAccountBalance() {
        var mock = BankAccountMock.aMock();

        var balance = mock.retrieveAccountBalance();

        assertEquals(balance, 8900);
    }

    @Test
    public void shouldRetrievedZeredAccount() {
        var bankAccount = new BankAccount();

        var balance = bankAccount.getBalance();

        assertEquals(balance, 0.0);
    }
}