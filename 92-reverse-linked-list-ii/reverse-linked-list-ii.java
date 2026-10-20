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
    

public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode temp = dummy;

    for (int i = 1; i < left; i++) {
        temp = temp.next;
    }

    ListNode tail1 = temp;
    ListNode head2 = temp.next;

    // Move temp to the node at position right
    for (int i = 0; i < right - left; i++) {
        temp = temp.next;
    }

    ListNode tail2 = temp.next;
    ListNode head3 = tail2.next;

    // Disconnect the sublist
    tail2.next = null;

    // Reverse the sublist
    reverse(head2);

    // Reconnect
    tail1.next = tail2;
    head2.next = head3;

    return dummy.next;
}

public void reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
}


}