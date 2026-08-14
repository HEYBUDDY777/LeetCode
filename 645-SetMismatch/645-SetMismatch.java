// Last updated: 8/14/2026, 10:49:25 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>1)
            {
                result[0] = i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(i+1))
            result[1] = i+1;
        }
        return result;
    }
}