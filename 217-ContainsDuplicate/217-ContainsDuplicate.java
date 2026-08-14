// Last updated: 8/14/2026, 10:51:27 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        } 
        return (set.size()!=nums.length);      
    }
}