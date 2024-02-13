import java.util.Stack;

class InfixToPrefix {
    
    static boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    static int precedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '^') {
            return 3;
        } else {
            return 0;
        }
    }

    static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == '(') {
                reversed.append(')');
            } else if (c == ')') {
                reversed.append('(');
            } else {
                reversed.append(c);
            }
        }
        return reversed.toString();
    }

    static String infixToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String reversedInfix = reverse(infix);

        for (char c : reversedInfix.toCharArray()) {
            if (isAlpha(c) || isDigit(c)) {
                prefix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    prefix.append(stack.pop());
                }
                stack.pop(); // Discard the '('
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    prefix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        return reverse(prefix.toString());
    }
}

public class InfixToPrefixExpression {

    public static void main(String[] args) {
        String infix = "(A-B/C)*(A/K-L)";
        String prefix = InfixToPrefix.infixToPrefix(infix);
        System.out.println("Infix Expression: " + infix);
        System.out.println("Prefix Expression: " + prefix);
    }
}
