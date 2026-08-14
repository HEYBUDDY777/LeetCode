// Last updated: 8/14/2026, 10:51:15 AM
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
    
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode firsthalf  = head;
        ListNode secondhalf = slow;
        ListNode current = slow;
        ListNode prev = null;
        while(current!=null)
        {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondhalf = prev;
        while(secondhalf!=null)
        {
            if(firsthalf.val != secondhalf.val)
            {
                return false;
            }
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
}