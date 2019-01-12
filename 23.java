/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
    	ListNode head = new ListNode(0);
        ListNode re = head;
    	int len = lists.length;
    	ListNode[] tmpArr = new ListNode[len];
    	for(int i = 0; i < len; i++)
    		tmpArr[i] = lists[i];
    	PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
    	for(int i=0; i<len; i++) 
    		while(tmpArr[i]!=null){
    			heap.add(tmpArr[i].val);
                tmpArr[i] = tmpArr[i].next;
            }
    	while(!heap.isEmpty()) {
    		head.next = new ListNode(heap.remove().intValue());
    		head = head.next;
    	}
    	return re.next;
    }
}