// Last updated: 9/2/2026, 11:31:07 AM
1import java.util.*;
2
3class Solution {
4    private int[] subtreeXor;
5    private Set<Integer>[] descendants;
6    private List<Integer>[] graph;
7
8    private void dfs(int node, int parent, int[] nums) {
9        subtreeXor[node] = nums[node];
10        descendants[node].add(node);
11
12        for (int neighbor : graph[node]) {
13            if (neighbor != parent) {
14                dfs(neighbor, node, nums);
15                subtreeXor[node] ^= subtreeXor[neighbor];
16                descendants[node].addAll(descendants[neighbor]);
17            }
18        }
19    }
20
21    public int minimumScore(int[] nums, int[][] edges) {
22        int n = nums.length;
23        graph = new ArrayList[n];
24        for (int i = 0; i < n; i++) {
25            graph[i] = new ArrayList<>();
26        }
27        for (int[] edge : edges) {
28            graph[edge[0]].add(edge[1]);
29            graph[edge[1]].add(edge[0]);
30        }
31
32        subtreeXor = new int[n];
33        descendants = new HashSet[n];
34        for (int i = 0; i < n; i++) {
35            descendants[i] = new HashSet<>();
36        }
37
38        dfs(0, -1, nums);
39
40        int totalXor = subtreeXor[0];
41        int minScore = Integer.MAX_VALUE;
42
43        for (int i = 1; i < n; i++) {
44            for (int j = i + 1; j < n; j++) {
45                int xorI = subtreeXor[i];
46                int xorJ = subtreeXor[j];
47                int val1, val2, val3;
48
49                if (descendants[i].contains(j)) { // j is in i's subtree
50                    val1 = xorJ;
51                    val2 = xorI ^ xorJ;
52                    val3 = totalXor ^ xorI;
53                } else if (descendants[j].contains(i)) { // i is in j's subtree
54                    val1 = xorI;
55                    val2 = xorJ ^ xorI;
56                    val3 = totalXor ^ xorJ;
57                } else { // Independent subtrees
58                    val1 = xorI;
59                    val2 = xorJ;
60                    val3 = totalXor ^ xorI ^ xorJ;
61                }
62                
63                int maxVal = Math.max(val1, Math.max(val2, val3));
64                int minVal = Math.min(val1, Math.min(val2, val3));
65                minScore = Math.min(minScore, maxVal - minVal);
66            }
67        }
68
69        return minScore;
70    }
71}