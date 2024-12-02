package meet4.hw;

import java.util.HashSet;

/*Задача 6: Множества (Sets)
Написать функцию, которая принимает массив целых чисел и возвращает количество уникальных чисел в этом массиве.
*/
public class Task6Sets {
    public static void main(String[] args) {
        int[] ints = new int[]{0, 1, 2, 2, 3, 3, 4, 4, 5, 10};
        System.out.println(countUniqueInts(ints));
    }

    public static int countUniqueInts(int[] ints) {
        HashSet<Integer> setOfInts = new HashSet<>();

        for (int number : ints) {
            setOfInts.add(number);
        }

        return setOfInts.size();
    }
}
