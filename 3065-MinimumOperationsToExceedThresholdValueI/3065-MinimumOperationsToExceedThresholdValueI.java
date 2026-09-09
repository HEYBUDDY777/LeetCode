// Last updated: 9/9/2026, 12:04:55 PM
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