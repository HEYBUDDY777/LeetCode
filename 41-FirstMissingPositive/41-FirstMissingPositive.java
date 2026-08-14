// Last updated: 8/14/2026, 11:06:14 AM
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int k = 1;
        for(int i=1;i<=nums.length;i++)
        {
            k=i;
            if(!set.contains(i))
            return i;
        }
        return k+1;
    }
}