// Last updated: 8/14/2026, 11:21:11 AM
1class Solution {
2    public int hIndex(int[] citations) {
3        Arrays.sort(citations);
4        int n = citations.length;
5        for(int i=0;i<n;i++)
6        {
7            int papers = n-i;
8            if(citations[i]>=papers)
9            return papers;
10        }
11        return 0;
12    }
13}