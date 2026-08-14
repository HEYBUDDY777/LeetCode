// Last updated: 8/14/2026, 10:51:36 AM
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
        ListNode prev = null;
        ListNode current = head;
        while(current!=null)
        {
            ListNode next = current.next;    //2
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}