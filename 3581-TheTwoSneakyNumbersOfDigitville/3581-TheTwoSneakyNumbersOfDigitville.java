// Last updated: 8/14/2026, 10:47:31 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] result = new int[2];
        int k = 0;
        for(int i:nums)
        {
            if(map.get(i)==2)
            {
                result[k] = i;
                k = 1;
            }
        }
        return result;
    }
}