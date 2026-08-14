// Last updated: 8/14/2026, 10:47:28 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int k = nums[0];
        for(int i=k;i<nums[nums.length-1];i++)
        {
            if(!set.contains(i))
            {
                li.add(i);
            }

            
        }
        return li;
    }
}