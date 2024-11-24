package meet2.oop;

import meet2.oop.task1_4.*;
import meet2.oop.task5.Circle1;
import meet2.oop.task5.Rectangle;
import meet2.oop.task5.Shape;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задача 1: Создание класса 'Круг' ===");
        Circle circle = new Circle(5);
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getCircumference());

        System.out.println("\n=== Задача 2: Класс 'Книга' ===");
        Book book = new Book("Мастер и Маргарита", "М. Булгаков", 500);
        book.printInfo();

        System.out.println("\n\n=== Задача 3: Наследование - Класс 'Сотрудник' и 'Менеджер' ===");
        Employee emp = new Employee("Иван", 30000);
        Manager mgr = new Manager("Ольга", 50000, 10000);

        emp.printInfo(); // Иван: зарплата 30000
        mgr.printInfo(); // Ольга: зарплата 50000, бонус 10000

        System.out.println("\n=== Задача 4: Инкапсуляция - Класс 'Банк' ===");
        BankAccount account = new BankAccount("12345", 1000.0);
        account.deposit(500);
        account.withdraw(300);
        System.out.println("Баланс: " + account.getBalance());

        System.out.println("\n=== Задача 5: Полиморфизм - Фигуры ===");
        Shape rectangle = new Rectangle(4, 5);
        Shape circle1 = new Circle1(3);

        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Площадь круга: " + circle1.getArea());
        System.out.println("Периметр круга: " + circle1.getPerimeter());
    }
}
