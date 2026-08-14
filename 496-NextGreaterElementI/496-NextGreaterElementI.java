// Last updated: 8/14/2026, 10:50:08 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    if(j == nums2.length-1){
                    s.push(-1);
                    }
                    else{
                        boolean c= true;
                        for(int k = j;k<nums2.length;k++)
                        {
                            if(nums2[j]<nums2[k])
                            {
                                s.push(nums2[k]);
                                c = false;
                                break;
                            }
                        }
                        if(c) s.push(-1);
                    }
                }
            }
        }
        int[] result = new int[s.size()];
        int index = 0;
        for(int i=s.size()-1;i>=0;i--)
        {
            result[i] = s.pop();
        }
        return result;
    }
}