package meet3.hw.task8;

/*Класс CheckingAccount:
Наследуется от BankAccount.
Реализует метод calculateInterest() без начисления процентов.*/
public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("Checking accounts cannot have interest");
    }
}
