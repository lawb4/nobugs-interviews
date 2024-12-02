package meet4.hw;

import java.util.HashMap;
import java.util.Map;

/*Задача 7: Словари (Maps)
Создать метод, который считает количество вхождений каждого символа в переданной строке и возвращает результат в виде карты (map).
*/
public class Task7Maps {
    public static void main(String[] args) {
        String input = "Создать метод, который считает количество вхождений каждого символа в переданной строке и возвращает результат в виде карты (map).";

        Map<Character, Integer> result = calculateOccurrencesInString(input);

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.printf("Символ: '%s', Количество: '%d'\n", entry.getKey(), entry.getValue());
        }
    }

    public static Map<Character, Integer> calculateOccurrencesInString(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        return map;
    }
}
