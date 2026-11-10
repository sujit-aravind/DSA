package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class OddEvenList {
	public ListNode oddEvenList(ListNode head) {

		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		ListNode current = head;

		int count = 1;

		while (current != null) {
			if (count % 2 == 0)
				right.add(current.val);
			else
				left.add(current.val);
			current = current.next;
			count++;
		}

		ListNode node = head;

		while (node != null) {
			for (int i = 0; i < left.size(); i++) {
				node.val = left.get(i);
				node = node.next;
			}
			for (int i = 0; i < right.size(); i++) {
				node.val = right.get(i);
				node = node.next;
			}
		}
		return head;
	}
}