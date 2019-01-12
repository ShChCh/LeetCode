package solution;

public class Solution {/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */

	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode tmp1 = l1;
		ListNode tmp2 = l2;
		ListNode head = new ListNode(0);
		ListNode re = head;
		while(tmp1 != null && tmp2 != null) {
			if(tmp1.val > tmp2.val) {
				head.next = new ListNode(tmp2.val);
				tmp2 = tmp2.next;
				head = head.next;
			}
			else {
				head.next = new ListNode(tmp1.val);
				tmp1 = tmp1.next;
				head = head.next;
			}
		}
		while(tmp1 != null) {
			head.next = new ListNode(tmp1.val);
			tmp1 = tmp1.next;
			head = head.next;
		}
		while(tmp2 != null) {
			head.next = new ListNode(tmp2.val);
			tmp2 = tmp2.next;
			head = head.next;
		}
		return re.next;
	}
}
