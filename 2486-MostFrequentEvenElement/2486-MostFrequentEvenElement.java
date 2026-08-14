// Last updated: 8/14/2026, 10:47:44 AM
class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            if(i%2==0)
            {
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int max = -1;
        int result = -1;
        for(int i:map.keySet())
        {
            if(map.get(i)>max || (map.get(i) == max && (result==-1 || i<result)))
            {
                max = map.get(i);
                result = i;
            }
        }
        return result;
    }
}