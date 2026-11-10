package DSA_LeetCode;

import java.util.Stack;

class RemoveDuplicatesII {
	public String removeDuplicates(String s, int k) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(stack.size() < k) {
				stack.push(s.charAt(i));
				continue;
			}	
		}
		return null;
	}
}