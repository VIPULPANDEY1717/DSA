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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for(int i = 0 ; i<m;i++){
            Arrays.fill(matrix[i],-1);
        }
        int id = 0;
        int top = 0;
        int down = m-1;
        int left = 0;
        int right  = n-1;

        while(top <= down && left <= right && head != null){
            if(id == 0){
                for(int i = left;i<=right && head!= null;i++){
                    matrix[top][i] = head.val;
                    head = head.next;
                }
                top++;
            }
            if(id == 1){
                for(int i = top; i<=down && head != null;i++){
                    matrix[i][right] = head.val;
                    head = head.next;
                }
                right--;

            }
            if(id == 2){
                for(int i = right; i>= left && head != null;i--){
                    matrix[down][i] = head.val;
                    head = head.next;
                }
                down--;
            }
            if(id == 3){
                for(int i = down; i>= top && head != null;i--){
                    matrix[i][left] = head.val;
                    head = head.next;
                }
                left++;
            }
            id = (id +1)%4;

        }
        return matrix;
    }
}