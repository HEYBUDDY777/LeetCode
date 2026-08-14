// Last updated: 8/14/2026, 10:50:34 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums1)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int k =0;
        int[] result = new int[Math.min(nums1.length,nums2.length)];
        for(int i:nums2)
        {
            if(map.containsKey(i))
            {
                result[k++] = i;
                map.put(i,map.get(i)-1);
                if(map.get(i)==0)
                map.remove(i);
            }
            
        }
        return Arrays.copyOf(result,k);
    }
}