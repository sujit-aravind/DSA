package DSA_LeetCode;

import java.util.Stack;

public class CalPointsII {
	public int calPoints(String[] operations) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < operations.length; i++) {

			if (!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+"))
				stack.push(Integer.parseInt(operations[i]));

			if (operations[i].equals("C") && !stack.isEmpty())
				stack.pop();

			if (operations[i].equals("D")) {
				int lastNum = stack.peek();
				stack.push(lastNum * 2);
			}

			if (operations[i].equals("+")) {
				int sum = 0;
				for (int j = stack.size()-1; j >= stack.size() - 2; j--)
					sum = sum + stack.get(j);
				stack.push(sum);
			}
		}

		int i = 0;
		int sum = 0;
		while (i < stack.size()) {
			sum = sum + stack.get(i);
			i++;
		}
		return sum;
	}
}