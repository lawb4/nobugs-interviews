package meet2.hw;

import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Задача 1: Сложение и вычитание чисел ===");
        getSumAndSubtraction(sc.nextInt(), sc.nextInt());

        System.out.println("\n=== Задача 2: Площадь прямоугольника ===");
        System.out.print("Ширина: ");
        double width = sc.nextDouble();
        System.out.print("Длина: ");
        double height = sc.nextDouble();
        System.out.printf("Площадь: %.0f\n", getAreaOfRectangle(width, height));

        System.out.println("\n=== Задача 3: Операции с остатком от деления ===");
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        getDivisionAndModulo(a, b);

        System.out.println("\n=== Задача 4: Перевод градусов Цельсия в Фаренгейты ===");
        System.out.print("Введите температуру в Цельсиях: ");
        double celsium = sc.nextDouble();
        System.out.printf("Температура в Фаренгейтах: %.0f\n", convertCelsiumToFahrenheit(celsium));

        System.out.println("\n=== Задача 5: Обмен значениями переменных ===");
        int c = 5;
        int d = 10;
        System.out.printf("До обмена: a = %d, b = %d\n", c, d);
        swapVariables(c, d);


    }

    /*Задача 1: Сложение и вычитание чисел
     Напишите программу, которая принимает два числа с консоли, складывает их и выводит разность.
     Пример ввода:
     10
     5
     Пример вывода:
     Сумма: 15
     Разность: 5
    */
    public static void getSumAndSubtraction(int a, int b) {
        int sum = a + b;
        int subtraction = a - b;

        System.out.printf("Сумма: %d\nРазность: %d\n", sum, subtraction);
    }

    /*Задача 2: Площадь прямоугольника
    Напишите программу, которая вычисляет площадь прямоугольника, используя введённые с консоли ширину и длину.
    Пример:
    Ширина: 4
    Длина: 6
    Площадь: 24
    */
    public static double getAreaOfRectangle(double width, double height) {
        return width * height;
    }

    /*Задача 3: Операции с остатком от деления
    Запросите у пользователя два числа и выведите результат их деления и остаток от деления.
    Пример:
    Введите первое число: 17
    Введите второе число: 3
    Результат деления: 5
    Остаток: 2
    */
    public static void getDivisionAndModulo(int a, int b) {
        System.out.printf("Результат деления: %d\nОстаток: %d\n",
                a / b, a % b);
    }

    /*Задача 4: Перевод градусов Цельсия в Фаренгейты
    Реализуйте программу, которая преобразует температуру из Цельсия в Фаренгейты:
    Формула: F = C * 9/5 + 32.
    Пример:
    Введите температуру в Цельсиях: 25
    Температура в Фаренгейтах: 77
    */
    public static double convertCelsiumToFahrenheit(double celsium) {
        return celsium * 9 / 5 + 32;
    }

    /*Задача 5: Обмен значениями переменных
    Поменяйте значения двух переменных местами без использования третьей переменной.
    Пример:
    До обмена: a = 5, b = 10
    После обмена: a = 10, b = 5
    */
    public static void swapVariables(int a, int b) {
        System.out.printf("После обмена: a = %d, b = %d", b, a);
    }
}
