// Last updated: 8/20/2026, 10:03:09 AM
1class Solution {
2    public boolean divideArray(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        HashSet<Integer> set = new HashSet<>();
5        for(int i:nums)
6        {
7            map.put(i,map.getOrDefault(i,0)+1);
8            set.add(i);
9        }
10        for(int i:set)
11        {
12            if(map.get(i)%2!=0)
13            return false;
14        }
15        return true;
16    }
17}