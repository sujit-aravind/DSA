package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
	public List<Integer> findCommon(List<Integer> list1, List<Integer> list2) {
		List<Integer> output = new ArrayList<>();
		for (int i = 0; i < list1.size();) {
			for (int j = 0; j < list2.size();) {
				
				if(list1.get(i) == list2.get(j)) {
					output.add(list1.get(i));
					list1.remove(i);
					list2.remove(j);
				} else {
					j++;
				}
			}
			i++;
		}
		return output;
	}
}