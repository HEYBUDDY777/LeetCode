// Last updated: 8/14/2026, 10:51:04 AM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<=n;i++)
        {
            if(!map.containsKey(i))
            return i;
        }
        return 0;
    }
}