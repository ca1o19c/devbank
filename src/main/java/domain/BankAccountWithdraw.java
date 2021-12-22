package domain;

public interface BankAccountWithdraw {
    /**
     * @param value
     * the withdrawal amount must be less than or equal to the total balance
     */
    void withdraw(double value);
}
