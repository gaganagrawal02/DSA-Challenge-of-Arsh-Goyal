package String;

public class validparenthesis {
    public static boolean isValid(String s) {
        // Array to simulate stack
        char[] stack = new char[s.length()];
        int top = -1; // Stack pointer

        for (char c : s.toCharArray()) {
            // If opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } else {
                // If closing bracket, check for corresponding opening bracket
                if (top == -1) {
                    // Stack is empty, no opening bracket available
                    return false;
                }
                if (c == ')' && stack[top] != '(') return false;
                if (c == '}' && stack[top] != '{') return false;
                if (c == ']' && stack[top] != '[') return false;
                // Pop from stack
                top--;
            }
        }
        // Stack should be empty for a valid string
        return top == -1;
    }
        public static void main(String[] args) {
         String s = "()[]{}";
            System.out.println(isValid(s));
    }
}
