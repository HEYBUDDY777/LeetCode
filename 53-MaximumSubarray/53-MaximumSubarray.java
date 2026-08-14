// Last updated: 8/14/2026, 10:53:41 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];

        for(int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(max, current);
        }

        return max;
    }
}