package DSA_LeetCode;

import java.util.Stack;

public class MakeGood {
	public String makeGood(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++)
			stack.push(s.charAt(i));

		int i = stack.size();

		while (i > 0) {

			char peek = Character.toLowerCase(stack.peek());
			char peekMinus = '\u0000';
			if(i - 2 > 0)
			peekMinus = Character.toLowerCase(stack.get(i - 2));

			if (peek == peekMinus) {

				boolean peekStatus = Character.isLowerCase(stack.peek())
						&& Character.isLowerCase(stack.get(i - 2));
				if (peekStatus == true) {
					i--;
					i--;
					continue;
				}
				boolean peekMinusStatus = Character.isUpperCase(stack.peek())
						&& Character.isUpperCase(stack.get(i - 2));
				if (peekMinusStatus == true) {
					i--;
					i--;
					continue;
				}
				stack.pop();
				stack.pop();
				i = stack.size();
			}
			i--;
		}

		String output = "";
		for (int j = 0; j < stack.size(); j++)
			output += stack.get(j);
		return output;
	}
}