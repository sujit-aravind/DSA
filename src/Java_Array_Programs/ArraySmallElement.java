package Java_Array_Programs;

public class ArraySmallElement {
	public static int smallElement(int[] arr, int total) {

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[0];
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 1 };
		System.out.println("smallest element array is " + smallElement(arr, arr.length));
	}
}