// Last updated: 9/9/2026, 12:04:44 PM
class Solution {
    public boolean uniformArray(int[] nums1) {
        int even = 0;
        int odd  = 0;
        int n = nums1.length;
        int emin = Integer.MAX_VALUE;
        int omin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums1[i]%2==0)
            {
                even++;
                emin = Math.min(emin,nums1[i]);
            }
            else{
                odd++;
                omin = Math.min(omin,nums1[i]);
            }
        }
        if(odd==n || even==n ||emin>omin)
        {
            return true;
        }
        return false;
    }
}