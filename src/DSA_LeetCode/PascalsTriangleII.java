package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	public List<Integer> getRow(int rowIndex) {

		List<Integer> row = new ArrayList<>();
		
		if(rowIndex == 0) {
			row.add(1);
			return row;
		}
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> previous = new ArrayList<>();

		int previousValue, currentValue;

		for (int i = 0; i <= rowIndex; i++) {
			for (int j = 0; j <= i; j++) {

				if ((j == 0) || (j == i)) {
					row.add(1);
				} else {
					previous = result.get(i - 1);
					previousValue = previous.get(j - 1);
					currentValue = previous.get(j);
					row.add(previousValue + currentValue);
				}
			}
			result.add(row);

			if (i != rowIndex) {
				row = new ArrayList<>();
			}
		}
		return row;
	}

	public static void main(String[] args) {

		PascalsTriangleII obj = new PascalsTriangleII();

		System.out.println(obj.getRow(0));
		System.out.println(obj.getRow(1));
		System.out.println(obj.getRow(2));
		System.out.println(obj.getRow(3));
		System.out.println(obj.getRow(4));
	}

}