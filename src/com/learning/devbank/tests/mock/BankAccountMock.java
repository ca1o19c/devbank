package com.learning.devbank.tests.mock;

import com.learning.devbank.domain.BankAccount;

public class BankAccountMock {
    public static BankAccount aMock() {
        return new BankAccount()
                .setAgency(1)
                .setNumber(1234)
                .setBalance(8900);
    }
}
