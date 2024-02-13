import java.util.Scanner;
import java.util.Stack;

class InfixToPostfix{
	static String InfixToPostfix(String infix) {
		StringBuilder postfix = new StringBuilder();
		Stack<Character> stack = new Stack<>();	
		
		for(char c: infix.toCharArray()) {
			if(Character.isLetterOrDigit(c)){
				postfix.append(c);
			}
			else if(c=='(') {
				stack.push(c);
			}
			else if(c==')') {
				while(!stack.isEmpty() && stack.peek()!= '(') {
					postfix.append(stack.pop());
				}
				stack.pop(); // Discard '('
			}
			else {
				// operator
				while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
					postfix.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			postfix.append(stack.pop());
		}
		
		return postfix.toString();
	}
	
	static int precedence(char operator) {
		switch(operator) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		default:
			return 0;
		}
	}
}
public class InfixToPostfixExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix = "a+b*(c-d)/e";
		String postfix = InfixToPostfix.InfixToPostfix(infix);
		System.out.println("Infix Expression: "+ infix);
		System.out.println("Postfix Expression: "+ postfix);
	}
}
