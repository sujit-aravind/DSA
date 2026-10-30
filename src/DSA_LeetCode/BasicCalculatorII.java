
package DSA_LeetCode;

import java.util.Stack;

public class BasicCalculatorII {

	public int calculate(String s) {

		Stack<Integer> stack = new Stack<>();

		int num = 0;
		char ch;
		char operation = '+';

		int result = 0;

		for (int i = 0; i < s.length(); i++) {

			ch = s.charAt(i);

			if (ch >= '0' && ch <= '9')
				num = ((num * 10) + (ch - '0'));

			if (((ch != ' ') && (ch < '0' || ch > '9')) || i == s.length() - 1) {

				if (operation == '+')
					stack.add(num);
				if (operation == '-')
					stack.add(-num);
				if (operation == '*')
					stack.add(stack.pop() * num);
				if (operation == '/')
					stack.add(stack.pop() / num);
				
				operation = ch;
				num = 0;
			}
		}

		if (!stack.empty()) {
			for (int i = 0; i < stack.size(); i++) {
				result += stack.get(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		BasicCalculatorII calculator = new BasicCalculatorII();

		System.out.println(calculator.calculate("3+2*2")); // 7
//		System.out.println(calculator.calculate(" 3/2 ")); // 1
//		System.out.println(calculator.calculate(" 3+5 / 2 ")); // 5
//		System.out.println(calculator.calculate("3-2*2")); // -1
//		System.out.println(calculator.calculate("12+3*4")); // 24
//		System.out.println(calculator.calculate("8/3")); // 2
	}
}
