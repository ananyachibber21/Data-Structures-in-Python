import java.util.Stack;

class PostfixToInfix{
	
	static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
	
	static String PostfixToInfix(String postfix){
		Stack<Character> stack = new Stack<>();
		
		for(char c: postfix.toCharArray()) {
			if(!isOperator(c)) {
				stack.push((c));
			}
			else {
				char operand2 = stack.pop();
				char operand1 = stack.pop();
				String expression = "("+ operand1 + c + operand2 + ")";
				stack.push(expression);
			}
		}
		return stack.toString();
	}
}

public class PostfixToInfixExpression {

	public static void main(String[] args) {
		String postfix = "ab+c*d-";
		String infix = PostfixToInfix.PostfixToInfix(postfix);
		System.out.println("Postfix Expression: " + postfix);
        System.out.println("Infix Expression: " + infix);

	}

}
