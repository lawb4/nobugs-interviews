package meet4.hw;

/*Задача 2: Строки (Strings)
Создать функцию, которая принимает строку и возвращает её в обратном порядке.
*/
public class Task2 {
    public static void main(String[] args) {
        String input = "Создать функцию, которая принимает строку и возвращает её в обратном порядке.";
        System.out.println(reverseString(input));
    }

    public static String reverseString(String str) {
        // Using StringBuilder instead of concatenating Strings for computational efficiency
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }
}
