package Java_Array_Programs;
public class SortElement {
	public static void main(String[] args) {
		int temp;
		int[] arr = { 2, 4, 3, 1, 5, 8 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}