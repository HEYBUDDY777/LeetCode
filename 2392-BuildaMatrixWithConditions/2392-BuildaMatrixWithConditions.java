// Last updated: 9/2/2026, 11:32:37 AM
1class Solution{
2public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
3	List<Integer> order1 = GenerateTopologicalSort(rowConditions, k);
4	List<Integer> order2 = GenerateTopologicalSort(colConditions, k);
5	if (order1.size() < k || order2.size() < k) return new int[0][0];
6	Map<Integer, Integer> m = new HashMap();
7	for (int i = 0; i < k; i++) m.put(order2.get(i), i);
8	int[][] ans = new int[k][k];
9	for (int i = 0; i < k; i++)
10		ans[i][m.get(order1.get(i))] = order1.get(i);
11	return ans;
12}
13private List<Integer> GenerateTopologicalSort(int[][] A, int k) {
14	int[] deg = new int[k];
15	List<Integer> order = new ArrayList();
16	List<List<Integer>> graph = new ArrayList();
17	for (int i = 0; i < k; i++) graph.add(new ArrayList());
18	Queue<Integer> q = new LinkedList();
19	for (int[] c: A) {
20		graph.get(c[0] - 1).add(c[1] - 1);
21		deg[c[1] - 1]++;
22	}
23	for (int i = 0; i < k; i++)
24		if (deg[i] == 0) q.add(i);
25	while(!q.isEmpty()) {
26		int x = q.poll();
27		order.add(x + 1);
28		for (int y: graph.get(x)) 
29			if (--deg[y] == 0) q.add(y);
30	}
31	return order;
32}
33}