package DSA_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Compress {
	public int compress(char[] chars) {

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < chars.length; i++) {
			if (map.containsKey(chars[i]))
				map.put(chars[i], map.get(chars[i]) + 1);
			else
				map.put(chars[i], 1);
		}
		
		String s = "";
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			char ch = entry.getKey();
			s += ch;
			int frequency = entry.getValue();
			s += frequency;
		}
		return s.length();
	}	
}