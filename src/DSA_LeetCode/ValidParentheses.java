package DSA_LeetCode;

import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {

		char currentValue;
		char previousValue;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			currentValue = s.charAt(i);

			if (currentValue == '(' || currentValue == '[' || currentValue == '{') {
				stack.push(currentValue);
			} else {

				if (stack.isEmpty()) {
					return false;
				}

				previousValue = stack.peek();

				if ((previousValue == '(') && (currentValue == ')')) {
					stack.pop();
				}

				else if ((previousValue == '[') && (currentValue == ']')) {
					stack.pop();
				}

				else if ((previousValue == '{') && (currentValue == '}')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		ValidParentheses obj = new ValidParentheses();

		System.out.println(obj.isValid("()"));
		System.out.println(obj.isValid("()[]{}"));
		System.out.println(obj.isValid("(]"));
		System.out.println(obj.isValid("([])"));
		System.out.println(obj.isValid("([)]"));
		System.out.println(obj.isValid("((("));
		System.out.println(obj.isValid(")"));
	}
}