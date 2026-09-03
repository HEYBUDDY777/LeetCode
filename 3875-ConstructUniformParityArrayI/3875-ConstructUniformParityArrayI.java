// Last updated: 9/3/2026, 12:40:36 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int even = 0;
4        int odd  = 0;
5        int n = nums1.length;
6        int emin = Integer.MAX_VALUE;
7        int omin = Integer.MAX_VALUE;
8        for(int i=0;i<n;i++)
9        {
10            if(nums1[i]%2==0)
11            {
12                even++;
13                emin = Math.min(emin,nums1[i]);
14            }
15            else{
16                odd++;
17                omin = Math.min(omin,nums1[i]);
18            }
19        }
20        if(odd==n || even==n ||emin>omin)
21        {
22            return true;
23        }
24        return false;
25    }
26}