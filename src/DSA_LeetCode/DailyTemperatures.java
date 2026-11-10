package DSA_LeetCode;

import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		
		

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < temperatures.length; i++) {
			int j = i + 1;
			int count = 0;
			boolean isFound = false;
			while (j < temperatures.length) {
				count++;
				if (temperatures[i] < temperatures[j]) {
					stack.push(count);
					isFound = true;
					break;
				}
				j++;
			}

			if (isFound == false)
				stack.push(0);
		}

		int[] arr = new int[stack.size()];

		for (int i = 0; i < stack.size(); i++)
			arr[i] = stack.get(i);
		return arr;
	}
}