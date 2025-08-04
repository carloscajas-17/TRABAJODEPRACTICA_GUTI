package Ejercicio_01_sign;

import java.util.Stack;

public class SignValidator {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!coincide(top, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean coincide(char a, char b) {
        return (a == '(' && b == ')') ||
               (a == '[' && b == ']') ||
               (a == '{' && b == '}');
    }
}
