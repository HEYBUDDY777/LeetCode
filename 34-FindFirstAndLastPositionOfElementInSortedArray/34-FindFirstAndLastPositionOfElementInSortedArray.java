// Last updated: 8/14/2026, 11:06:28 AM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.fill(result,-1);
    
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target){
            result[0] = i;
            break;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target){
            result[1] = i;
            }
        }

        return result;
    }
}