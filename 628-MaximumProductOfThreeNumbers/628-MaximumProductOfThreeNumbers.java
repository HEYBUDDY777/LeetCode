// Last updated: 8/14/2026, 10:49:27 AM
class Solution {
    public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int max = Math.max((nums[0]*nums[1]*nums[nums.length-1]) , 
    nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3]);
    return max;
    }
}