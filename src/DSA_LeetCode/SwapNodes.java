package DSA_LeetCode;

public class SwapNodes {
	public ListNode swapNodes(ListNode head, int k) {

		if (head == null)
			return head;

		ListNode current = head;
		int len = 1;

		while (current != null) {
			len++;
			current = current.next;
		}

		ListNode left = head;
		ListNode right = head;

		int left1 = 1;
		int right1 = 1;

		while (left != null) {
			if (left1 == k)
				break;
			left1++;
			left = left.next;
		}

		while (right != null) {
			if (right1 == len - k)
				break;
			right1++;
			right = right.next;
		}

		int val = left.val;
		left.val = right.val;
		right.val = val;

		return head;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		int k = 2;

		SwapNodes obj = new SwapNodes();
		head = obj.swapNodes(head, k);
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}