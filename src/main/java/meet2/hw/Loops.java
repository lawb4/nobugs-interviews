package meet2.hw;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("=== Задача 1: Вывод чисел от 1 до 10 ===");
        printNumbersOneToTen();

        System.out.println("\n\n=== Задача 2: Сумма чисел от 1 до N ===");
        System.out.print("Введите N: ");
        int n1 = sc.nextInt();
        System.out.printf("Сумма: %d", getSumOfRangedNumbers(n1));

        System.out.println("\n\n=== Задача 3: Таблица умножения для числа ===");
        System.out.print("Введите число: ");
        int n2 = sc.nextInt();
        printMultiplicationTable(n2);

        System.out.println("\n=== Задача 4: Факториал числа ===");
        System.out.print("Введите N: ");
        int n3 = sc.nextInt();
        System.out.printf("Факториал: %d", getFactorial(n3));

        System.out.println("\n\n=== Задача 5: Чётные числа до N ===");
        System.out.print("Введите N: ");
        int n4 = sc.nextInt();
        System.out.print("Чётные числа: ");
        printEvenNumbersForRange(n4);
    }

    /*Задача 1: Вывод чисел от 1 до 10
    Напишите программу, которая выводит все числа от 1 до 10.
    Пример вывода:
    1 2 3 4 5 6 7 8 9 10*/
    public static void printNumbersOneToTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ", i);
        }
    }

    /*Задача 2: Сумма чисел от 1 до N
    Пользователь вводит число N. Вычислите сумму всех чисел от 1 до N.
    Пример:
    Введите N: 5
    Сумма: 15*/
    public static int getSumOfRangedNumbers(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    /*Задача 3: Таблица умножения для числа
    Пользователь вводит число. Выведите таблицу умножения для этого числа от 1 до 10.
    Пример:
    Введите число: 3
    3 x 1 = 3
    3 x 2 = 6
    ...
    3 x 10 = 30
    */
    public static void printMultiplicationTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", a, i, a * i);
        }
    }

    /*Задача 4: Факториал числа
    Напишите программу, которая вычисляет факториал числа N (N! = 1 * 2 * ... * N).
    Пример:
    Введите N: 4
    Факториал: 24
    */
    public static int getFactorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    /*Задача 5: Чётные числа до N
    Пользователь вводит число N. Выведите все чётные числа от 1 до N.
    Пример:
    Введите N: 10
    Чётные числа: 2 4 6 8 10
    */
    public static void printEvenNumbersForRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
