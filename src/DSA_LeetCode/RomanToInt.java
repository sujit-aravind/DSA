package DSA_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public int romanToInt(String s) {

		int result = 0;
		int output = 0;

		char previous;
		char current;

		int previousValue = 0;
		int currentValue = 0;

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		for (int i = 0; i < s.length(); i++) {

			output = 0;

			if (i + 1 < s.length()) {

				previous = s.charAt(i);
				current = s.charAt(i + 1);

				previousValue = map.get(previous);
				currentValue = map.get(current);

				if (previousValue < currentValue) {
					output = output - previousValue;
					result = result + output;
				} else {

					output = output + previousValue;
					result = result + output;
				}
			} else {

				previous = s.charAt(i);
				previousValue = map.get(previous);
				result = result + previousValue;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		RomanToInt obj = new RomanToInt();

		System.out.println(obj.romanToInt("III"));
		System.out.println(obj.romanToInt("LVIII"));
		System.out.println(obj.romanToInt("IV"));
		System.out.println(obj.romanToInt("IX"));
		System.out.println(obj.romanToInt("MCMXCIV"));
		System.out.println(obj.romanToInt("VI"));
		System.out.println(obj.romanToInt("XL"));
		System.out.println(obj.romanToInt("CM"));
	}
}