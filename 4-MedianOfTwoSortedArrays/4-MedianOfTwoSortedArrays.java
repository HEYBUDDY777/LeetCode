// Last updated: 8/14/2026, 11:07:37 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] result = new int[n1+n2];
        int i=0,j=0,k=0;
        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                result[k++]=nums1[i++];
            }
            else
            {
                result[k++]=nums2[j++];
            }
        }
        while(i < nums1.length )
        {
            result[k++] = nums1[i++];
        }
        while(j < nums2.length )
        {
            result[k++] = nums2[j++];
        }
        if(result.length%2==0)
        return (result[result.length / 2] + result[(result.length / 2) - 1]) / 2.0;
        else
        return result[result.length/2];
    }
}