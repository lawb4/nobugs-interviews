package meet4.hw;

/*Задача 1: Массивы (Arrays)
Написать метод, который принимает массив целых чисел и возвращает сумму всех элементов массива.
*/
public class Task1 {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getSumOfArrayElements(ints));
    }

    public static int getSumOfArrayElements(int[] ints) {
        int sum = 0;
        for (int number : ints) {
            sum += number;
        }
        return sum;
    }
}
