// Last updated: 8/14/2026, 10:49:17 AM
class Solution {
    public int pivotIndex(int[] nums) {
       int total = 0;
       int left = 0;
       for(int val:nums)
       {
         total += val;
       }
       for(int i=0;i<nums.length;i++)
       {
        int right = total-left-nums[i];
        if(right==left)
        {
            return i;
        }
        left += nums[i];
       }
       return -1;
    }
}