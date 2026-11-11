package DSA_LeetCode;

import java.util.Stack;

class RemoveDuplicatesII {
	public String removeDuplicates(String s, int k) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (stack.size() < k - 1) {
				stack.push(s.charAt(i));
				continue;
			}
			stack.push(s.charAt(i));
			char ch = stack.peek();
			int kLen = stack.size() - k;
			boolean isCapture = false;
			while (kLen < stack.size()) {
				if (stack.get(kLen) == ch)
					isCapture = true;
				else {
					isCapture = false;
					break;
				}
				kLen++;
			}
			if (isCapture == true) {
				int j = 0;
				while (j < k) {
					stack.pop();
					j++;
				}
			}
		}
		String output = "";
		for (int i = 0; i < stack.size(); i++)
			output = output + stack.get(i);
		return output;
	}

	public static void main(String[] args) {
		RemoveDuplicatesII sol = new RemoveDuplicatesII();
		String s = "deeedbbcccbdaa";
		int k = 3;
		String result = sol.removeDuplicates(s, k);
		System.out.println(result);
	}
}