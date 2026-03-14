package Java_Array_Programs;

public class Duplicate_Elements_Two {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,3,5};
		int[] seen = new int[arr.length];
		int size = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					seen[size] = arr[i];
					size++;
				}
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(seen[i] + " ");
		}
	}
}