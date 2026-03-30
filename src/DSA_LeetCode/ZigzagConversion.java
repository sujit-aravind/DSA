package DSA_LeetCode;

public class ZigzagConversion {
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		System.out.println(ZigzagConversion.convert(s, 3));
	}

	public static String convert(String s, int numRows) {

		int currentRow = 0;
		boolean goingDown = true;
		if (numRows == 1 || s.length() <= numRows)
			return s;
		StringBuilder[] row = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++) {
			row[i] = new StringBuilder();
		}
		for (int i = 0; i < s.length(); i++) {
			row[currentRow].append(s.charAt(i));
			if (currentRow == 0)
				goingDown = true;
			if (currentRow == numRows - 1)
				goingDown = false;
			if (goingDown)
				currentRow++;
			else
				currentRow--;
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			result.append(row[i]);
		}
		return result.toString();
	}
}