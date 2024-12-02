package meet4.hw;

import java.util.ArrayList;
import java.util.List;

/*Задача 3: Списки (Lists)
Разработать метод, который принимает список целых чисел и удаляет из него все четные числа.
*/
public class Task3Lists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }
        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }

        removeOddNumbersFromList(numbers);
        System.out.println();

        for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }
    }

    public static void removeOddNumbersFromList(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
            }
        }
    }
}
