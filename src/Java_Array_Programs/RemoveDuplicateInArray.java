package Java_Array_Programs;

public class RemoveDuplicateInArray {

	public static int removeDuplicate(int[] arr) {

		int temp;
		int index = 1;
		int total = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					temp = arr[j];

					if (j + 1 < total)
						arr[j] = arr[j + 1];
					do {

						if (j + index < total) {
							arr[j + index] = arr[j + index];
							index++;
						}
					} while (arr[j] == total);
					arr[total] = temp;
					--total;
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 3, 2, 4, 5, 6 };
		int total = removeDuplicate(arr);
		for (int i = 0; i < total; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}