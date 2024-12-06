package meet6.bankapp;

import java.util.List;

public class BankApp {
    private List<Account> accounts;
    private Account activeAccount;

    public BankApp(List<Account> accounts) {
        if (accounts.isEmpty()) throw new IllegalStateException("No accounts in Bank app");
        this.accounts = accounts;
        this.activeAccount = accounts.get(0);
    }

    public void showBalance() {
        System.out.println("Balance is " + activeAccount.getBalance());
    }

    public void transferTo(Account account, int amount) {
        activeAccount.transferTo(account, amount);
    }

    public void switchActiveAccountTo(Account account) {
        if (this.activeAccount.getId().equals(account.getId()))
            throw new IllegalStateException("You are already using this account");
        activeAccount = account;
    }
}
