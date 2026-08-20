// Last updated: 8/20/2026, 9:40:53 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int n = nums.length;
4        List<Integer> l1 = new ArrayList<>();
5        List<Integer> l2 = new ArrayList<>();
6
7        l1.add(nums[0]);
8        l2.add(nums[1]);
9        for(int i=2;i<n;i++)
10        {
11            if(l1.get(l1.size()-1)>l2.get(l2.size()-1))
12            {
13                l1.add(nums[i]);
14            }
15            else{
16                l2.add(nums[i]);
17            }
18        }
19        int temp = 0;
20        for(int i=0;i<l1.size();i++)
21        {
22            nums[temp] = l1.get(i);
23            temp++;
24        }
25        for(int i=0;i<l2.size();i++)
26        {
27            nums[temp] = l2.get(i);
28            temp++;
29        }
30        return nums;
31    }
32}