// Last updated: 8/14/2026, 10:51:11 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int product = 1;
        int zeroCount = 0;

        for(int num : nums) {
            if(num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        for(int i = 0; i < n; i++) {
            if(zeroCount > 1) {
                result[i] = 0;
            } 
            else if(zeroCount == 1) {
                result[i] = (nums[i] == 0) ? product : 0;
            } 
            else {
                result[i] = product / nums[i];
            }
        }

        return result;
    }
}