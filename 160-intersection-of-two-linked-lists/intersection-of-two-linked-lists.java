/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = length(headA);
        int l2 = length(headB);
        if(l1 > l2){
            int n = l1-l2;
            for(int i = 1; i<= n; i++){
                headA = headA.next;
            }
        }else{
            int n = l2-l1;
            for(int i = 1; i<= n; i++){
                headB = headB.next;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB) return headA;
            else{
                headA = headA.next;
                headB = headB.next;
            }
           
        }
        return null;
        
    }
    int length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}