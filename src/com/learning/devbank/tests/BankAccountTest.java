package com.learning.devbank.tests;

import com.learning.devbank.domain.BankAccount;
import com.learning.devbank.tests.mock.BankAccountMock;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class BankAccountTest {

    @Test
    public void shouldAccountDeposit() {
        var mock = BankAccountMock.aMock();

        Assert.assertEquals(mock.getBalance(), 8900);

        mock.deposit(120);

        Assert.assertEquals(mock.getBalance(), 9020);
    }

    @Test
    public void shouldAccountWithdraw() {
        var mock = BankAccountMock.aMock();

        var response = mock.withdraw(8900);

        Assert.assertEquals(response, "Saque conlcluído com sucesso");

        var balance = mock.getBalance();

        Assert.assertEquals(balance, 0);
    }

    @Test
    public void shouldNotAccountWithdraw() {
        var mock = BankAccountMock.aMock();

        var response = mock.withdraw(10000);

        Assert.assertEquals(response, "Saldo insuficiente para efetuar o saque");

        var balance = mock.getBalance();

        Assert.assertEquals(balance, 8900);
    }

    @Test
    public void shouldRetrievesAccountBalance() {
        var mock = BankAccountMock.aMock();

        var balance = mock.retrieveAccountBalance();

        Assert.assertEquals(balance, 8900);
    }

    @Test
    public void shouldRetrievedZeredAccount() {
        var bankAccount = new BankAccount();

        var balance = bankAccount.getBalance();

        Assert.assertEquals(balance, 0.0);
    }
}