package Java_Array_Programs;

public class SmallestElement {

	public static int smallElement(int[] arr, int total) {

		int temp;

		for (int i = 0; i < total; i++) {
			for (int j = i+1; j < total; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 3, 5, 2, 1 };
		System.out.println("second smalest element is : " + smallElement(arr, arr.length));
	}
}