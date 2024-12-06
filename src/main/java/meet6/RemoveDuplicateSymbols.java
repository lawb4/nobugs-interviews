package meet6;

public class RemoveDuplicateSymbols {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("root"));
        System.out.println(removeDuplicates("r"));
        System.out.println(removeDuplicates("roott"));
        System.out.println(removeDuplicates("ooooo"));
        //System.out.println(removeDuplicates(""));
        System.out.println(removeDuplicates(" "));
    }

    public static String removeDuplicates(String str) {
        StringBuilder res = new StringBuilder();

        if (str.isEmpty()) throw new IllegalStateException("Str is empty");
        char currentSymbol = str.charAt(0);

        if (str.length() == 1) res.append(currentSymbol);

        for (int i = 0; i < str.length(); i++) {
            if (currentSymbol != str.charAt(i)) {
                res.append(currentSymbol);
                currentSymbol = str.charAt(i);
            }
            if (i == str.length() - 1) {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}
