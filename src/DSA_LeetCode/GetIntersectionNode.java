package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GetIntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		List<ListNode> listA = new ArrayList<>();
		List<ListNode> listB = new ArrayList<>();

		while (headA != null) {
			listA.add(headA);
			headA = headA.next;
		}

		while (headB != null) {
			listB.add(headB);
			headB = headB.next;
		}

		int len = listA.size();
		if (len > listB.size())
			len = listB.size();

		ListNode captureNode = null;
		int listAsize = listA.size() - 1;
		int listBsize = listB.size() - 1;

		for (int i = len; i > 0; i--) {

			if (listA.get(listAsize) != listB.get(listBsize))
				break;
			captureNode = listA.get(listAsize);
		}
		return captureNode;
	}
}