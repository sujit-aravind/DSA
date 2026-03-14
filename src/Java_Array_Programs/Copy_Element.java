package Java_Array_Programs;
public class Copy_Element {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {};
		int size = 0;
		
		for(int i = 0; i < arr1.length; i++) {
			
			arr2[size] = arr1[i];
			size++;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}