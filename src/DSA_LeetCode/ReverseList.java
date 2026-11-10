package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
	public ListNode reverseList(ListNode head) {

		if (head == null)
			return null;

		ListNode current = head;
		List<Integer> list = new ArrayList<>();

		while (current != null) {
			list.add(current.val);
			current = current.next;
		}
		ListNode node = head;
		for (int i = list.size() - 1; i >= 0; i--) {
			node.val = list.get(i);
			node = node.next;
		}
		return head;
	}
}