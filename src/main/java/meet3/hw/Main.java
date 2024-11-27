package meet3.hw;

import meet3.hw.task4.Person;
import meet3.hw.task5.Student;
import meet3.hw.task6.Product;
import meet3.hw.task7.Animal;
import meet3.hw.task7.Dog;
import meet3.hw.task8.BankAccount;
import meet3.hw.task8.CheckingAccount;
import meet3.hw.task8.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Task 4 Person ===");
        Person person1 = new Person("Jacob", 29);
        Person person2 = new Person("Jacob", 29);

        System.out.println(person1.equals(person2));

        System.out.println("\n=== Task 5 Student ===");
        Student student1 = new Student("Anna", "101", 3.8);
        Student student2 = student1.clone();

        student2.setName("Jacob");

        System.out.println("This is Anna: " + student1); //  Student{id='101', name='Anna', gpa=3.8}
        System.out.println("This is Jacob: " + student2);   // Student{id='101', name='Mike', gpa=3.8}

        System.out.println("\n=== Task 6 Product ===");
        Product product1 = new Product("Self-help book", 100, "id001");
        Product product2 = product1.clone();

        product2.setPrice(999.99);

        System.out.println("This is a cheap self-help book: " + product1); //  Product{name='Self-help book', price=100, id='id001'}
        System.out.println("This is an overpriced self-help book with the same id as the cheap self-help book: " + product2);   // Product{name='Self-help book', price=999.99, id='id001'}

        System.out.println("\n=== Task 7 Animal and Dog ===");
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
        dog.fetch();

        System.out.println("\n=== Task 8 BankAccount ===");
        BankAccount[] bankAccounts = new BankAccount[]{
                new SavingsAccount("testSavingsAccount1", 500),
                new CheckingAccount("testCheckingAccount1", 100)
        };

        for (BankAccount bankAccount : bankAccounts) {
            System.out.printf("Bank Account: %s\n", bankAccount.getAccountNumber());

            System.out.println("Calculating interest...");
            bankAccount.calculateInterest();

            System.out.println("Depositing some money...");
            bankAccount.deposit(200);
            System.out.printf("Money deposited. New balance is %.2f\n", bankAccount.getBalance());

            System.out.println("Calculating interest...");
            bankAccount.calculateInterest();

            System.out.println("Withdrawing some money...");
            bankAccount.withdraw(100);
            System.out.printf("Money withdrawn. New balance is %.2f\n", bankAccount.getBalance());

            System.out.println("Calculating interest...");
            bankAccount.calculateInterest();

            System.out.println();
        }
    }
}