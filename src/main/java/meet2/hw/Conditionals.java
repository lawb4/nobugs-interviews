package meet2.hw;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Задача 1: Проверка чётности числа ===");
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        System.out.printf("Результат: %s", getParity(a));

        System.out.println("\n\n=== Задача 2: Простой калькулятор ===");
        System.out.print("Введите первое число: ");
        int number1 = sc.nextInt();

        System.out.print("Введите оператор: ");
        String operator = sc.next();

        System.out.print("Введите второе число: ");
        int number2 = sc.nextInt();

        System.out.println(calculate(number1, operator, number2));

        System.out.println("\n=== Задача 3: Определение времени года ===");
        System.out.print("Введите номер месяца: ");
        int monthNumber = sc.nextInt();
        System.out.println(getSeason(monthNumber));

        System.out.println("\n=== Задача 4: Проверка возраста ===");
        System.out.print("Введите возраст: ");
        int age = sc.nextInt();
        System.out.printf("Результат: %s", verifyAge(age));

        System.out.println("\n\n=== Задача 5:  Проверка делимости ===");
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        System.out.printf("Результат: %s", verifyDivisibility(number));

    }

    /*Задача 1: Проверка чётности числа
    Напишите программу, которая проверяет, является ли число чётным или нечётным.
    Пример:
    Введите число: 8
    Результат: Чётное
    */
    public static String getParity(int a) {
        return a % 2 == 0 ? "Чётное" : "Нечётное";
    }

    /*Задача 2: Реализуйте простой калькулятор, который выполняет операции +, -, *, /, используя switch.
    Пример:
    Введите первое число: 7
    Введите оператор: *
    Введите второе число: 3
    Результат: 21
    */
    public static String calculate(int a, String operator, int b) {
        int result;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    return "Error: Division by 0!";
                }
                break;
            default:
                return "Error: Incorrect operator!";
        }
        return String.format("Результат: %d", result);
    }

    /*Задача 3: Определение времени года
    Пользователь вводит номер месяца (1-12). Выведите название соответствующего времени года, используя switch.
    Пример:
    Введите номер месяца: 12
    Результат: Зима
    */
    public static String getSeason(int monthNumber) {
        switch (monthNumber) {
            case 12, 1, 2:
                return "Зима";
            case 3, 4, 5:
                return "Весна";
            case 6, 7, 8:
                return "Лето";
            case 9, 10, 11:
                return "Осень";
            default:
                return "Неверный номер месяца!";
        }
    }

    /*Задача 4: Проверка возраста
    Напишите программу, которая определяет категорию человека по возрасту:
    0-12: Ребёнок
    13-17: Подросток
    18-64: Взрослый
    65+: Пенсионер.
    Используйте if-else.
    Пример:
    Введите возраст: 30
    Результат: Взрослый
    */
    public static String verifyAge(int age) {
        if (age >= 0 && age <= 12) {
            return "Ребёнок";
        } else if (age >= 13 && age <= 17) {
            return "Подросток";
        } else if (age >= 18 && age <= 64) {
            return "Взрослый";
        } else if (age >= 65) {
            return "Пенсионер";
        } else {
            return "Неверный возраст!";
        }
    }

    /*Задача 5: Проверка делимости
    Напишите программу, которая проверяет, делится ли число на 3 и 5 одновременно.
    Пример:
    Введите число: 15
    Результат: Делится на 3 и 5
    */
    public static String verifyDivisibility(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            return "Делится на 3 и 5";
        } else {
            return "Не делится на 3 и 5";
        }
    }
}
