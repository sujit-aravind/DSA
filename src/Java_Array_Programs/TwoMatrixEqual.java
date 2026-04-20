package Java_Array_Programs;
public class TwoMatrixEqual {
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 8, 4, 6 }, { 4, 5, 7 } };
		int[][] b = { { 1, 2, 3 }, { 8, 4, 6 }, { 4, 5, 7 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] != b[i][j]) {
					System.out.println("it is not a perfect matrix");
					return;
				}
			}
		}
		System.out.println("it is a perfect matrix");
	}
}