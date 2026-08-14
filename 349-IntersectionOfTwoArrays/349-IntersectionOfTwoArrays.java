// Last updated: 8/14/2026, 10:50:37 AM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer>set = new HashSet<>();
       HashSet<Integer>result = new HashSet<>();
       int k = 0;
       for(int val:nums1)
       {
        set.add(val);
       }
       for(int val:nums2)
       {
        if(set.contains(val))
        {
            result.add(val);
        }
       }
       int[] ans = new int[result.size()];
       int i=0;
       for(int val:result)
       {
        ans[i++]= val;
       }
       return ans;
    }
}