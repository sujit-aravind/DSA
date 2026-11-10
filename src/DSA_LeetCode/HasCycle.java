package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class HasCycle {
	public boolean hasCycle(ListNode head) {

		List<ListNode> list = new ArrayList<>();
		while (head != null) {
			if (list.contains(head))
				return true;
			list.add(head);
			head = head.next;
		}
		return false;
	}
}