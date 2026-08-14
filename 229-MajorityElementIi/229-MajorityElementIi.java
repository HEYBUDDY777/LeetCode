// Last updated: 8/14/2026, 10:51:17 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:nums)
        {
            if(map.get(i)>nums.length/3)
            set.add(i);
        }
        for(int i:set)
        {
            li.add(i);
        }
        return li;
    }
}