package DSA_LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumRescueBoats {
	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < people.length; i++)
			list.add(people[i]);

		int count = 0;
		int i = 0;
		int len = list.size() - 1;

		while (!list.isEmpty()) {

			if ((list.get(i) + list.get(len) <= limit) && (i != len)) {
				count++;
				list.remove(len);
				list.remove(i);
				len = list.size() - 1;
				continue;
			}

			if (list.get(i) < list.get(len)) {
				count++;
				list.remove(len);
				len = list.size() - 1;
				continue;
			}
			count++;
			list.remove(i);
			len = list.size() - 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] people = { 3, 2, 2, 1 };
		int limit = 3;
		NumRescueBoats rescueboats = new NumRescueBoats();
		int result = rescueboats.numRescueBoats(people, limit);
		System.out.println(result);
	}
}