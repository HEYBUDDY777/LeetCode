// Last updated: 8/31/2026, 10:17:52 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        int[] result = {-1,-1};
14        ListNode prev = head;
15        ListNode curr = head.next;
16
17        int position = 1;
18        int first = -1;
19        int last = -1;
20        int mindistance = Integer.MAX_VALUE;
21
22        while(curr.next!=null)
23        {
24            ListNode next = curr.next;
25            if((prev.val<curr.val && next.val<curr.val)||(prev.val>curr.val && next.val>curr.val)){
26                if(first == -1)
27                {
28                    first = position;
29                }
30                if(last != -1)
31                {
32                    mindistance = Math.min(mindistance,position-last);
33                }
34                last = position;
35            }
36            prev = curr;
37            curr = next;
38            position++;
39        }
40        if(first!=-1 && last!=first)
41        {
42            result[0] = mindistance;
43            result[1] = last-first;
44        }
45        return result;
46    }
47}