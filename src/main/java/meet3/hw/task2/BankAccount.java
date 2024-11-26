package meet3.hw.task2;

/*Задача 2: Класс для представления банковского счета
Описание:
Создайте класс BankAccount, который будет представлять банковский счет.
Класс должен содержать:
Поля:
Номер счета (accountNumber).
Баланс (balance).
Методы:
deposit(double amount): пополнение счета.
withdraw(double amount): снятие денег с проверкой на достаточность средств.
getBalance(): возвращает текущий баланс.*/
public class BankAccount {
    private String accountNumber;
    private double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("На счету недостаточно средств!");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
