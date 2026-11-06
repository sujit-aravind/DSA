package DSA_LeetCode;

public class DeleteDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode current = head;
		while (current != null && current.next != null) {
			while ((current.next != null) && (current.val == current.next.val)) {
				current.next = current.next.next;
			}
			current = current.next;
		}
		return head;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
		DeleteDuplicates solution = new DeleteDuplicates();
		ListNode result = solution.deleteDuplicates(head);

		while (result != null) {
			System.out.print(result.val);
			if (result.next != null) {
				System.out.print(" -> ");
			}
			result = result.next;
		}
	}
}