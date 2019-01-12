/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
		 if(head==null || head.next == null) return null;
	     ListNode slow=head.next, fast=head.next.next; 
	     while(fast!=slow)
	     {
	         if(fast==null||fast.next==null) return null;
	         slow=slow.next;
	         fast=fast.next.next;
	     }
	     fast=head;
	     while(fast!=slow)
	     {
	         fast=fast.next;
	         slow=slow.next;
	     }
	     return slow;
    }
}