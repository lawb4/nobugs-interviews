package meet6.hw;

import java.util.Arrays;

/*Задача 1:
Двусуммный (Two Sum): Дан массив целых чисел nums и целое число target. Найдите два числа в массиве так, чтобы их сумма была равна target. Верните их индексы. Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды. Вы можете вернуть ответ в любом порядке.

Вход: nums = [2, 7, 11, 15], target = 9 Выход: [0, 1] Выход объяснение: nums[0] + nums[1] == 9, мы возвращаем [0, 1].
*/
public class TwoSumArray {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalStateException("Error. No solution found.");
    }
}
