// Last updated: 8/14/2026, 11:06:52 AM
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int index = 0;
        for(int val:set)
        {
            nums[index++]=val;
        }
        return set.size();
    }
}