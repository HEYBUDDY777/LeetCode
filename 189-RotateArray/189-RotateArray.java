// Last updated: 8/14/2026, 10:51:58 AM
class Solution {
    public void rotate(int[] nums, int k) {
    //     k = k%nums.length;
    //     int[] result = new int[nums.length];
    //     int m = 0;
    //    for(int i=nums.length-k;i<nums.length;i++)
    //    {
    //         result[m++] = nums[i];
    //    } 
    //    for(int i=0;i<nums.length-k;i++)
    //    {
    //         result[m++] = nums[i];
    //    }
    //    for(int i=0;i<nums.length;i++)
    //    {
    //      nums[i] = result[i];
    //    }

    k = k%nums.length;
    int n = nums.length;
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);
    }
    public void reverse(int[] nums,int left,int right)
    {
        while(left<right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}