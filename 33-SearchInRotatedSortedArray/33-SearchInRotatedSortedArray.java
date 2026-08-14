// Last updated: 8/14/2026, 11:06:30 AM
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}