package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PrintVertically {
	public List<String> printVertically(String s) {
		String[] regex = s.split(" ");
		int len = 0;
		for (String string : regex) {
			if (string.length() > len)
				len = string.length();
		}
		List<String> list = new ArrayList<>();
		for (String string : regex) {
			list.add(string);
			if (list.getLast().length() != len) {
				String word = list.getLast();
				list.remove(list.size() - 1);
				int remaining = len - word.length();
				int i = 0;
				while (i < remaining) {
					word += " ";
					i++;
				}
				list.add(word);
			}
		}
		
		List<String> output = new ArrayList<>();
		
		for (int i = 0; i < len; i++) {
			String word = "";
			int j = 0;
			while(j < list.size()) {
				word += list.get(j).charAt(i);
				j++;
			}
			output.add(word.stripTrailing());
		}
		return output;
	}
}










