package meet4.hw;

import java.util.HashSet;

/*Задача 6: Множества (Sets)
Написать функцию, которая принимает массив целых чисел и возвращает количество уникальных чисел в этом массиве.
*/
public class Task6 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{0, 1, 2, 2, 3, 3, 4, 4, 5, 10};
        System.out.println(countUniqueInts(numbers));
    }

    public static int countUniqueInts(Integer[] numbers) {
        HashSet<Integer> setOfInts = new HashSet<>();

        for (Integer number : numbers) {
            setOfInts.add(number);
        }

        return setOfInts.size();
    }
}
