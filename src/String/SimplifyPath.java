package String;
import java.util.*;
public class SimplifyPath {
    public static String simplifyPath(String path) {
        // Use a stack to handle the directory names
        Stack<String> stack = new Stack<>();
        // Split the path by '/'
        String[] components = path.split("/");

        for (String component : components) {
            // If the component is empty or a single period, skip it
            if (component.isEmpty() || component.equals(".")) {
                continue;
            }
            // If the component is a double period, pop from the stack if it's not empty
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Otherwise, push the component to the stack
                stack.push(component);
            }
        }

        // Build the canonical path from the stack
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/");
            result.append(dir);
        }

        // Return the result; if the stack was empty, return "/"
        return result.length() > 0 ? result.toString() : "/";
    }
    public static void main(String[] args) {
        SimplifyPath solution = new SimplifyPath();
        String path = "/home/user/Documents/../Pictures";
        System.out.println(solution.simplifyPath(path));
    }
}
