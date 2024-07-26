package String;

public class ReversedWords {
    public static String reverseWords(String s) {
        // Split the string by spaces
        String[] words = s.trim().split("\\s+");
        // Use a StringBuilder to build the result
        StringBuilder reversed = new StringBuilder();
        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println("Reversed words of \"" + s + "\": \"" + reverseWords(s) + "\""); // Output: "blue is sky the"
    }
}
