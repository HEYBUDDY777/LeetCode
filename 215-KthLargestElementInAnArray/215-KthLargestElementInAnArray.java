// Last updated: 8/14/2026, 10:51:32 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int num:nums)
        {
            q.offer(num);
            if(q.size()>k)
            {
                q.poll();
            }
        }
        return q.peek();
    }
}