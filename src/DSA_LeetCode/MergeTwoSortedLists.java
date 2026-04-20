package DSA_LeetCode;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		if (list1 == null) return list2;
		if (list2 == null) return list1;

		ListNode head = new ListNode();
		ListNode current = head;

		while ((list1 != null) && (list2 != null)) {

			if (list2.val > list1.val) {
				current.next = list1;
				list1 = list1.next;
				current = current.next;
			} else {
				current.next = list2;
				list2 = list2.next;
				current = current.next;
			}
		}

		if (list1 != null) {
			while (list1 != null) {
				current.next = list1;
				list1 = list1.next;
				current = current.next;
			}
		} else if (list2 != null) {
			while (list2 != null) {
				current.next = list2;
				list2 = list2.next;
				current = current.next;
			}
		}
		return head.next;
	}
}