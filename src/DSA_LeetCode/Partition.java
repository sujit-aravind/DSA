package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Partition {
	public ListNode partition(ListNode head, int x) {

		List<Integer> left = new ArrayList<>();
		List<Integer> right = new ArrayList<>();
		ListNode current = head;

		while (current != null) {
			if (current.val < x)
				left.add(current.val);
			else
				right.add(current.val);
			current = current.next;
		}

		ListNode node = head;

		for (int i = 0; i < left.size(); i++) {
			node.val = left.get(i);
			node = node.next;
		}
		for (int i = 0; i < right.size(); i++) {
			node.val = right.get(i);
			node = node.next;
		}
		return head;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(2);

		int x = 3;
		Partition obj = new Partition();
		head = obj.partition(head, x);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}