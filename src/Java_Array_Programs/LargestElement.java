package Java_Array_Programs;

public class LargestElement {

	public static int getLargestElement(int[] arr, int find) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[find - 1];
	}

	public static void main(String[] args) {
		int arr1[]={1,2,5,6,3,2};  
		int find = 3;
		System.out.println("third largest element is : " + getLargestElement(arr1, find));
	}
}