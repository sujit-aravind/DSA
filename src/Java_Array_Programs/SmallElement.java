package Java_Array_Programs;

public class SmallElement {
	public static void main(String[] args) {

		int[] arr = { 25, 35, 75, 55 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Max Element is : " + min);

	}
}