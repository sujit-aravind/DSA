package Java_Array_Programs;

public class EvenPosition {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 1; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}

	}
}