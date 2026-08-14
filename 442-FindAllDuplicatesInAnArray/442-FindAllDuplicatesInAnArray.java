// Last updated: 8/14/2026, 10:50:15 AM
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> li = new ArrayList<>();
        HashSet<Integer> set = new LinkedHashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            set.add(i);
        }
        for(int i:set)
        {
            if(map.get(i)>=2)
            {
                li.add(i);
            }
        }
        return li;
    }
}