package DSA_LeetCode;
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int carry = 0;

		ListNode head = null;
		ListNode tail = null;

		while (l1 != null || l2 != null || carry != 0) {

			int value1 = 0;
			int value2 = 0;

			if (l1 != null) {
				value1 = l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				value2 = l2.val;
				l2 = l2.next;
			}

			int sum = value1 + value2 + carry;
			int digit = sum % 10;
			carry = sum / 10;

			ListNode newNode = new ListNode(digit);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
		}
		return head;
	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		AddTwoNumbers obj = new AddTwoNumbers();
		ListNode result = obj.addTwoNumbers(l1, l2);

		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}