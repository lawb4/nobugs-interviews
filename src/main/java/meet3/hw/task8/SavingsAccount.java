package meet3.hw.task8;

/*Класс SavingsAccount:
Наследуется от BankAccount.
Реализует метод calculateInterest(), добавляя 5% годовых к балансу.*/
public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        double balanceWithInterest = super.getBalance() * (1 + (double) 5 / 100);
        setBalance(balanceWithInterest);
        System.out.printf("The '%s' balance with interest is: %.2f\n", this.getAccountNumber(), balanceWithInterest);
    }
}
