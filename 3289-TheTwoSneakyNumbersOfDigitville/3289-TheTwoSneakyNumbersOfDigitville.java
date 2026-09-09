// Last updated: 9/9/2026, 12:04:54 PM
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