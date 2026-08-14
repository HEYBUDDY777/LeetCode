// Last updated: 8/14/2026, 10:50:12 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> li = new ArrayList<>();
        for(int num:nums)
        {
            set.add(num);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))
            li.add(i);
        }
        return li;
    }
}