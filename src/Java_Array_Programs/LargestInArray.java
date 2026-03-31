package Java_Array_Programs;

public class LargestInArray {
	public static int getLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];
	}

	public static void main(String args[]) {
		int arr[] = { 3, 2, 1 };
		System.out.println("Largest: " + getLargest(arr, arr.length));
	}
}