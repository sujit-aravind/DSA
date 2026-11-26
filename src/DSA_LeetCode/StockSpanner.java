package DSA_LeetCode;

import java.util.Stack;

class StockSpanner {

	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> input = new Stack<Integer>();

	public StockSpanner() {
	}

	public int next(int price) {
		if (stack.isEmpty()) {
			stack.add(price);
			return 1;
		}
		int count = 0;
		boolean captured = false;
		input.add(price);
		while (!stack.isEmpty()) {
			int num = stack.pop();
			if (num > price) {
				input.add(num);
				count++;
				captured = true;
				break;
			}
			count++;
			input.add(num);
		}
		if (stack.isEmpty() && captured == false)
			count++;
		while (!input.isEmpty())
			stack.add(input.pop());

		return count;
	}

	public static void main(String[] args) {
		StockSpanner stockSpanner = new StockSpanner();
		System.out.println(stockSpanner.next(100)); // 1
		System.out.println(stockSpanner.next(80)); // 1
		System.out.println(stockSpanner.next(60)); // 1
		System.out.println(stockSpanner.next(70)); // 2
		System.out.println(stockSpanner.next(60)); // 1
		System.out.println(stockSpanner.next(75)); // 4
		System.out.println(stockSpanner.next(85)); // 6
	}
}