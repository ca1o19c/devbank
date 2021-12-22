import domain.BankAccount;
import mock.BankAccountMock;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankAccountTest {

    @Test
    public void shouldAccountDeposit() {
        var mock = BankAccountMock.aMock();

        assertThat(mock.getBalance())
                .isEqualTo(8900);

        mock.deposit(120);

        assertThat(mock.getBalance())
                .isEqualTo(9020);
    }

    @Test
    public void shouldAccountWithdraw() {
        var mock = BankAccountMock.aMock();

        mock.withdraw(900);

        var balance = mock.getBalance();

        assertThat(balance)
                .isEqualTo(8000);
    }

    @Test
    public void shouldNotAccountWithdraw() {
        var mock = BankAccountMock.aMock();

        mock.withdraw(10000);

        var balance = mock.getBalance();

        assertThat(balance)
                .isEqualTo(8900);
    }

    @Test
    public void shouldRetrievesAccountBalance() {
        var mock = BankAccountMock.aMock();

        var balance = mock.retrieveAccountBalance();

        assertThat(balance)
                .isEqualTo(8900);
    }

    @Test
    public void shouldRetrievedZeredAccount() {
        var bankAccount = new BankAccount();

        var balance = bankAccount.getBalance();

        assertThat(balance)
                .isEqualTo(0.0);
    }
}