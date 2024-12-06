package meet6.bankapp;

import java.util.Objects;

public class Account {
    private String id;
    private String number;
    private int balance;
    private AccountType type;

    public Account(String id, String number, AccountType type, int balance) {
        this.id = id;
        this.number = number;
        this.balance = balance;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public AccountType getType() {
        return type;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void transferTo(Account account, int amount) {
        if (balance >= amount) {
            account.setBalance(account.getBalance() + amount);
            balance -= amount;
        } else {
            throw new IllegalStateException("Not enough money on the account: " + number);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return getBalance() == account.getBalance() && Objects.equals(getId(), account.getId()) && Objects.equals(getNumber(), account.getNumber()) && getType() == account.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNumber(), getBalance(), getType());
    }
}
