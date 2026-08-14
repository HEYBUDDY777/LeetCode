// Last updated: 8/14/2026, 10:47:32 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int output = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<k)
            output++;
        }
        return output;
    }
}