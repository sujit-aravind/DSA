package DSA_LeetCode;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode node = new ListNode();

		do {
			if (list2.val > list1.val) {
				node.next = list1;
				list1 = list1.next;
				node = node.next;
			} else {
				node.next = list2;
				list2 = list2.next;
				node = node.next;
			}
		} while ((list1.next != null) && (list2.next != null));
		
		if (list1.next != null) {
			do {
				node.next = list1;
				list1 = list1.next;
				node = node.next;
			} while (list1.next != null);
			
		} else if (list2.next != null) {
			do {
				node.next = list2;
				list2 = list2.next;
				node = node.next;
			} while (list2.next != null);
		}
		return node;
	}
}