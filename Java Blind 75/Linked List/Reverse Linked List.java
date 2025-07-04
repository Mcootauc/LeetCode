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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //recursively iterates to the end of the linkedlist 
        ListNode p = reverseList(head.next);
        //Ex: node 4 has head 5 => head.next is 5 so head.next.next is the pointer for node 5 so it points back to 4
        head.next.next = head;
        //set head.next to null so the if statement calls
        head.next = null;
        return p;
    }
}