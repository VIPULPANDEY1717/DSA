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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
       ArrayList<ListNode> arr = new ArrayList<>();  
        for(ListNode node : lists){
            arr.add(node);
        }
        while(arr.size() > 1){
            ListNode a = arr.get(arr.size() -1);
            arr.remove(arr.size()-1);
            ListNode b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            ListNode c = mergeSort(a,b);
            arr.add(c);
        }
        return arr.get(0);

    }
    public ListNode mergeSort(ListNode a , ListNode b){
        ListNode i = a;
        ListNode j = b;
        ListNode dummy = new ListNode (-1);
        ListNode t = dummy;
        while(i!= null && j != null){
            if(i.val <= j.val){
                t.next = i;
                i = i.next;
            }else{
                t.next = j;
                j = j.next;
            }
            t = t.next;
        }
        if(i == null){
            t.next = j;
        }else{
            t.next = i;
        }
        return dummy.next;

    }
}