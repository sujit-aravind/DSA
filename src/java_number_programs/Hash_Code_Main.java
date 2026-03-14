package java_number_programs;

public class Hash_Code_Main {
	public static void main(String[] args) {
		
		Hash_Code emp_1 = new Hash_Code(200, "joey");
		Hash_Code emp_2 = new Hash_Code(200, "joey");
		
		System.out.println(emp_1.equals(emp_2));
		
		int hs_value_1 = emp_1.hashCode();
		int hs_value_2 = emp_2.hashCode();
		
		System.out.println("employee 1 hash code value : " + hs_value_1);
		System.out.println("employee 2 hash code value : " + hs_value_2);
		
		System.out.println("comparing employee 1 and employee 2 : " + emp_1.equals(emp_2));
		
	}
}