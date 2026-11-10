package DSA_LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
	public int[] asteroidCollision(int[] asteroids) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < asteroids.length; i++) {

			if (asteroids[i] > 0 || stack.isEmpty()) {
				stack.push(asteroids[i]);
				continue;
			}

			if (!stack.isEmpty()) {

				if (stack.peek() < 0) {
					stack.push(asteroids[i]);
					continue;
				}

				int num = Math.abs(asteroids[i]);
				boolean status = true;
				while (status == true) {
					
					if (!stack.isEmpty()) {
						
						if (stack.peek() < 0) {
							stack.push(asteroids[i]);
							status = false;
							break;
						}
						
						int peak = Math.abs(stack.peek());
						if (peak == num) {
							if (stack.peek() == asteroids[i]) {
								stack.push(asteroids[i]);
								status = false;
								continue;
							}
							stack.pop();
							status = false;
							continue;
						}
						if (peak < num) {
							stack.pop();
							continue;
						}
						break;
					} else {
						stack.push(asteroids[i]);
						status = false;
					}
				}
			} else
				stack.push(asteroids[i]);
		}

		int[] arr = new int[stack.size()];

		for (int i = 0; i < stack.size(); i++)
			arr[i] = stack.get(i);
		return arr;
	}

	public static void main(String[] args) {
		AsteroidCollision obj = new AsteroidCollision();
		int[] asteroids = { 2, -2 };
		System.out.println(Arrays.toString(obj.asteroidCollision(asteroids)));
	}
}