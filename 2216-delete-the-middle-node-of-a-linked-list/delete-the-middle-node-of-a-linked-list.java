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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        int count = 0;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

            //count++;
        }
        if(head.next==null){
            return null;
        }
        prev.next = slow.next;
        
        //if(count == 0){
            //return head;
        //}
        //ListNode temp = head;
        //for(int i = 1; i<count;i++){
        //    temp = temp.next;

        //}
        
        return head;
    
    }
}