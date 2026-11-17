package DSA_LeetCode;

import java.util.Stack;

class MyQueue {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public MyQueue() {

	}

	public void push(int x) {
		while(!s1.isEmpty()) {
			int val = s1.pop();
			s2.push(val);
		}
		s1.push(x);
		while (!s2.isEmpty()) {
			int val = s2.pop();
			s1.push(val);
		}
	}

	public int pop() {
		return s1.pop();
	}

	public int peek() {
		return s1.peek();

	}

	public boolean empty() {
		return s1.isEmpty();

	}
}