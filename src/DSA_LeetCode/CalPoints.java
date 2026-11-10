package DSA_LeetCode;

import java.util.Stack;

public class CalPoints {
	public boolean backspaceCompare(String s, String t) {

		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == '#') && (!stack1.isEmpty())) {
				stack1.pop();
				continue;
			}
			if (s.charAt(i) != '#')
				stack1.push(s.charAt(i));
		}

		for (int i = 0; i < t.length(); i++) {
			if ((t.charAt(i) == '#') && (!stack2.isEmpty())) {
				stack2.pop();
				continue;
			}
			if ((t.charAt(i) != '#'))
				stack2.push(t.charAt(i));
		}

		if (stack1.equals(stack2))
			return true;
		return false;
	}

	public static void main(String[] args) {

		CalPoints sol = new CalPoints();

		String s = "y#fo##f";
		String t = "y#f#o##f";

		boolean result = sol.backspaceCompare(s, t);
		System.out.println(result);
	}
}