package DSA_LeetCode;

import java.util.Arrays;

public class Compress {
	public int compress(char[] chars) {

		int count = 0;
		int index = 0;
		String s = "";

		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			s += ch;
			for (int j = i + 1; j < chars.length; j++) {
				if (ch != chars[j])
					break;
				if (count == 0)
					count++;
				count++;
				index = j;
			}
			if (count != 0)
				s += count;
			else
				continue;
			i = index;
			count = 0;
		}
		for (int i = 0; i < s.length(); i++) {
			chars[i] = s.charAt(i);
		}
		return s.length();
	}

	public static void main(String[] args) {
		char[] chars = { 'a', 'b', 'b', 'c' };
		Compress obj = new Compress();
		int result = obj.compress(chars);
		System.out.println("Compressed Length: " + result);
		System.out.println("Compressed Array: " + Arrays.toString(chars));
	}
}