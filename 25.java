/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    	ListNode newhead = new ListNode(0);
    	ListNode re = newhead;
    	while(head!=null)
    	{
    		ListNode tmpHead = new ListNode(0);
    		ListNode tmpH = head;
    		int count = 0;
    		ListNode tail = head;
    		while(head != null && count<k) {
    			ListNode tmpNode = tmpHead.next;
    			tmpHead.next = new ListNode(head.val);
    			tmpHead.next.next = tmpNode;
    			if(count==0)
    				tail = tmpHead.next;
    			count++;
    			head = head.next;
    		}
    		if(count==k) {
    			newhead.next = tmpHead.next;
    			newhead = tail;
    		}
    		else
    			newhead.next = tmpH;
    		
    	}
    	return re.next;
    }
}