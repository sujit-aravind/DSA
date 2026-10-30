package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {

		List<String> input = new ArrayList<>();

		for (int i = 0; i < strs.length; i++)
			input.add(strs[i]);

		List<List<String>> output = new ArrayList<>();
		List<String> list = new ArrayList<>();

		for (int i = 0; i < input.size();) {

			String word = input.get(i);
			list.add(word);
			input.remove(i);
			
			for (int j = i; j < input.size(); j++) {
				String match = input.get(j);

				if (word.length() != match.length())
					continue;

				int k = 0;
				boolean status = true;
				StringBuilder sb = new StringBuilder();
				sb.append(match);
				while (k < word.length()) {

					int index = sb.indexOf(String.valueOf(word.charAt(k)));
					if (index == -1) {
						status = false;
						break;
					}
					sb.deleteCharAt(index);
					k++;
				}
				if (status == true) {
					list.add(match);
					input.remove(j);
					j--;
				}
				status = true;
			}
			output.add(list);
			list = new ArrayList<>();
		}
		return output;
	}
}