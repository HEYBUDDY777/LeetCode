// Last updated: 8/14/2026, 10:50:56 AM
// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int result = 0;
//         for(int i:nums)
//         {
//             map.put(i,map.getOrDefault(i,0)+1);
//             if(map.get(i)>1)
//             {
//                 result = i;
//                 break;
//             }
//         }
        
//         return result;
//     }
// }
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] checkHas = new boolean[nums.length];
        for(int num : nums){
            if(checkHas[num]){
                return num;
            }
            checkHas[num] = true;
        }

        return -1;
    }
}