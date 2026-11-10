package DSA_LeetCode;

public class RotateRight {
	public ListNode rotateRight(ListNode head, int k) {
		
		if(head == null)
			return head;

		ListNode current = head;
		ListNode first = current;
		ListNode last = null;
		int len = 0;
		while (current != null) {
			if (current.next == null)
				last = current;
			len++;
			current = current.next;
		}

		if (k >= len)
			k = k % len;

		last.next = first;

		int newHead = len - k + 1;
		if (newHead == 0)
			return head;
		int newHeadCount = 0;
		current = head;

		while (true) {
			if (newHead == newHeadCount + 1) {
				for (int i = 0; i < newHeadCount - 1; i++)
					current = current.next;
				current.next = null;
				break;
			}
			head = head.next;
			newHeadCount++;
		}
		return head;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		int k = 2;

		RotateRight sol = new RotateRight();
		ListNode result = sol.rotateRight(head, k);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

}