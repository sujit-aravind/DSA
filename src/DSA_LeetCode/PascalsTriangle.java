package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> result = new ArrayList<>();
		List<Integer> rows = new ArrayList<>();
		List<Integer> previousRow;

		int previousValue, currentValue;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j <= i; j++) {

				if ((j == 0) || (j == i)) {
					rows.add(1);
				} else {

					previousRow = result.get(i - 1);
					previousValue = previousRow.get(j - 1);
					currentValue = previousRow.get(j);
					rows.add(previousValue + currentValue);

				}
			}
			result.add(rows);
			rows = new ArrayList<>();
		}
		return result;
	}

	public static void main(String[] args) {

		PascalsTriangle obj = new PascalsTriangle();
		int numRows = 5;

		List<List<Integer>> result = obj.generate(numRows);
		System.out.println(result);
	}

}