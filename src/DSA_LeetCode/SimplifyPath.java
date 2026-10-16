package DSA_LeetCode;

import java.util.Stack;

public class SimplifyPath {

	public String simplifyPath(String path) {

		Stack<String> stack = new Stack<>();
		String[] arr = path.split("/");
		String output = "";
		int i = 0, len = arr.length;

		while (i < len) {

			if (arr[i].isEmpty()) {
				i++;
				continue;
			}

			if (arr[i].equals("..")) {
				if (!stack.empty())
					stack.pop();
				i++;
				continue;
			}

			if (arr[i].equals(".")) {
				i++;
				continue;
			}
			stack.add(arr[i]);
			i++;
		}

		if (!stack.empty()) {
			i = 0;
			while (i < stack.size()) {
				output += "/" + stack.elementAt(i);
				i++;
			}
			return output;
		}
		return "/";
	}
}