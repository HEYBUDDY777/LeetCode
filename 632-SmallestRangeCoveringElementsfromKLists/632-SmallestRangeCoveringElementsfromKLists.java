// Last updated: 9/2/2026, 12:02:41 PM
1class Solution {
2    public int[] smallestRange(List<List<Integer>> nums) {
3
4        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
5        int curMax = Integer.MIN_VALUE;
6
7        for (int i = 0; i < nums.size(); i++) {
8            minHeap.offer(new int[]{nums.get(i).get(0), i, 0});
9            curMax = Math.max(curMax, nums.get(i).get(0));
10        }
11
12        int[] smallRange = new int[]{0, Integer.MAX_VALUE};
13
14        while (true) {
15            int[] curr = minHeap.poll();
16            int curMin = curr[0], listIdx = curr[1], elemIdx = curr[2];
17
18            if (curMax - curMin < smallRange[1] - smallRange[0]) {
19                smallRange[0] = curMin;
20                smallRange[1] = curMax;
21            }
22
23            if (elemIdx + 1 < nums.get(listIdx).size()) {
24                int nextVal = nums.get(listIdx).get(elemIdx + 1);
25                minHeap.offer(new int[]{nextVal, listIdx, elemIdx + 1});
26                curMax = Math.max(curMax, nextVal);
27            } else {
28                break;
29            }
30        }
31        return smallRange;
32    }
33}