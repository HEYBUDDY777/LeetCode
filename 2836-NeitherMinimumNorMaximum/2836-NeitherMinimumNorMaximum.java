// Last updated: 8/14/2026, 10:47:43 AM
class Solution {
    public int findNonMinOrMax(int[] nums) {
        // if(nums.length<2)
        // {
        //     return -1;
        // }
        // Arrays.sort(nums);
        
        // for(int i:nums)
        // {
        //     if(i==nums[0]||i==nums[nums.length-1])
        //     {
        //         continue;
        //     }
        //     if(i!=nums[0] && i!=nums[nums.length-1])
        //     {
        //         return i;
        //     }
        // }
        // return -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:nums)
        {
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        for(int i:nums)
        {
            if(i==min || i==max)
            {
                continue;
            }
            if(i!=min && i!=max)
            {
                return i;
            }
        }
        return -1;
    }
}