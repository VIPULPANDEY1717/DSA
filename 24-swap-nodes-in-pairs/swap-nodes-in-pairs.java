/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode d = new ListNode (-1);
        d.next = head;
        ListNode t = d;
        while(t.next != null && t.next.next != null){
            ListNode c1 = t.next;
            ListNode  c2 = c1.next;

            c1.next = c2.next;
            c2.next = c1;
            t.next = c2;
             t= c1;
        }
        return d.next;
    }
}