// Last updated: 8/14/2026, 10:53:13 AM
class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 0;

        for (int num : nums) {

            if (k < 2 || num != nums[k - 2]) {
                nums[k++] = num;
            }
        }

        return k;
    }
}