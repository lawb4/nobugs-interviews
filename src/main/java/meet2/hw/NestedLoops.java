package meet2.hw;

public class NestedLoops {
    public static void main(String[] args) {
        System.out.println("=== Задача 1: Таблица умножения ===");
        printMultiplicationTable();

        System.out.println("=== Задача 2: Прямоугольник из звёздочек ===");
        printStarRectangle(3, 4);

        System.out.println("\n=== Задача 3: Пирамида из звёздочек ===");
        printStarPyramid(3);

        System.out.println("\n=== Задача 4: Поиск простых чисел ===");
        printPrimes(10);

        System.out.println("\n\n=== Задача 5: Шахматная доска ===");
        printChessBoard(4);
    }

    /*Задача 1: Таблица умножения
    Выведите таблицу умножения от 1 до 10 в формате:
    1 x 1 = 1
    1 x 2 = 2
    ...
    10 x 10 = 100
    */
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }

    /*Задача 2: Прямоугольник из звёздочек
    Напишите программу, которая выводит прямоугольник из звёздочек размером M x N (пользователь вводит размеры).
    Пример:
    ****
    ****
    ****
    */
    public static void printStarRectangle(int m, int n) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*Задача 3: Пирамида из звёздочек
    Реализуйте программу, которая выводит пирамиду из звёздочек высотой N.
    Пример:
       *
      ***
     *****
    */
    public static void printStarPyramid(int n) {
        // Pyramid's height
        for (int i = 1; i <= n; i++) {
            // Spacebars for stars (decreases with each subsequent row)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Stars to print (using formula 2*i-1 because of the odd numbers pattern)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Go to next row
            System.out.println(" ");
        }
    }

    /*Задача 4: Поиск простых чисел
    Найдите все простые числа от 2 до N. Используйте вложенные циклы для проверки делимости.
    Пример:
    Введите N: 10
    Простые числа: 2 3 5 7
    */
    public static void printPrimes(int n) {
        if (n < 2) {
            System.out.println("Неверный промежуток чисел");
            return;
        }
        // Установить промежуток чисел
        for (int i = 2; i <= n; i++) {
            // Флаг для проверки, является ли текущее число из итерации простым
            boolean isPrime = true;
            // Проверить делимость от 2 до квадратного корня числа
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    // Если данное число не простое, перейти к следующей итерации (числу)
                    break;
                }
            }
            if (isPrime) {
                System.out.printf("%d ", i);
            }
        }
    }

    /*Задача 5: Шахматная доска
    Выведите шахматную доску размером N x N, где клетки чередуются символами # и ..
    Пример:
    #.#.
    .#.#
    #.#.
    .#.#
    */
    public static void printChessBoard(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Паттерн чередования. Если сумма индекса строки и столбца чётная, то выводим символ `#`
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                    // В ином случае (если сумма индекса строки и столбца нечётная), то выводим символ `.`
                } else {
                    System.out.print(".");
                }
            }
            // Переход к следующему шахматному ряду
            System.out.println();
        }
    }
}
