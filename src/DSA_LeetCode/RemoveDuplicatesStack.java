package DSA_LeetCode;

import java.util.Stack;

public class RemoveDuplicatesStack {
	public String removeDuplicates(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.isEmpty()) {
				stack.push(s.charAt(i));
				continue;
			}
			if (stack.peek() == s.charAt(i)) {
				stack.pop();
				continue;
			}
			stack.push(s.charAt(i));
		}

		StringBuilder sb = new StringBuilder();
		for (Character c : stack)
			sb.append(c);
		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "abbaca";
		RemoveDuplicatesStack sol = new RemoveDuplicatesStack();
		String result = sol.removeDuplicates(s);
		System.out.println(result);
	}
}