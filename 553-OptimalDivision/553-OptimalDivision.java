// Last updated: 9/2/2026, 11:42:58 AM
1class Solution {
2    private Pair<String, Double> solve(int[] nums, int idx) {
3        if (idx == nums.length - 1)
4            return new Pair<String, Double>(nums[idx] + "", (double) nums[idx]);
5        else if (idx == nums.length - 2)
6            return new Pair<String, Double>(+nums[idx] + "/" + nums[idx + 1], (double) nums[idx] / nums[idx + 1]);
7
8        double adiv = (double) nums[idx] / nums[idx + 1];
9        Pair<String, Double> apair = solve(nums, idx + 2);
10        adiv /= apair.getValue();
11        double bdiv = nums[idx];
12        Pair<String, Double> bpair = solve(nums, idx + 1);
13        bdiv /= bpair.getValue();
14        if (adiv < bdiv) {
15            return new Pair<String, Double>(+nums[idx] + "/" + nums[idx + 1] + "/" + apair.getKey(), adiv);
16        }
17        return new Pair<String, Double>(nums[idx] + "/" + bpair.getKey(), bdiv);
18
19    }
20
21    public String optimalDivision(int[] nums) {
22        if(nums.length == 1) return nums[0]+"";
23        else if(nums.length == 2) return nums[0]+"/"+nums[1];
24        Pair<String, Double> pair = solve(nums, 1);
25        return nums[0]+"/("+pair.getKey()+")";
26    }
27}