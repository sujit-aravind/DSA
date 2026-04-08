package java_matrices_programs;
public class MatrixSubtraction {
	public static void main(String[] args) {

		int[][] arr1 = {{4, 5, 6}, {3, 4, 1}, {1, 2, 3}};
		int[][] arr2 = {{2, 0, 3}, {2, 3, 1}, {1, 1, 1}};
		int[][] arr3 = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr3[i][j] = arr1[i][j] - arr2[i][j];
				System.out.printf("%4d", arr3[i][j]);
			}
			System.out.println();
		}
	}
}