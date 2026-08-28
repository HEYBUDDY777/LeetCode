// Last updated: 8/28/2026, 2:36:36 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        int n = 0;
4        HashSet<Integer> set = new HashSet<>();
5        for(int i:candyType)
6        {
7            set.add(i);
8            n++;
9        }
10        if(n/2 <= set.size())
11        {
12            return n/2;
13        }
14        return set.size();
15    }
16}