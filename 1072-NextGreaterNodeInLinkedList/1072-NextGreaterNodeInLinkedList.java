// Last updated: 8/14/2026, 10:48:54 AM
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
    public int[] nextLargerNodes(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        ListNode curr = head;
        int i = 0;
        while(curr!=null)
        {
            ListNode next = curr.next;
            while(next != null)
            {
                if(curr.val<next.val)
                {
                    arr[i] = next.val;
                    break;
                }
                next = next.next;
            }
            curr = curr.next;
            i++;
        }
        return arr;
    }
}