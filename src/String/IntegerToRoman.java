package String;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        // Define the values and the corresponding symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // StringBuilder to build the Roman numeral string
        StringBuilder roman = new StringBuilder();

        // Iterate over the values to build the Roman numeral
        for (int i = 0; i < values.length && num > 0; i++) {
            // While the current value can be subtracted from num, append the symbol
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }

        return roman.toString();
    }

        public static void main(String[] args) {
int num = 3749;
            System.out.println(intToRoman(num));
    }
}
