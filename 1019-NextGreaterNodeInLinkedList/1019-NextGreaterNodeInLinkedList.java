// Last updated: 9/9/2026, 12:06:58 PM
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