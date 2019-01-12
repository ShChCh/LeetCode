/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution { 
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode p=head;
        int n=1;
        while(p.next !=null){
            n++;
            p=p.next;
        }
        p.next=head;
        k=n-k%n;
        p=head;
        while(k-->1){
            p=p.next;
        }
        head=p.next;
        p.next=null;
        p=head;
        return head;
    }
}