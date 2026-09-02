// Last updated: 9/2/2026, 11:38:24 AM
1class Solution {
2    public int[][] reconstructQueue(int[][] people) {
3        
4    Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
5	List<int[]> ordered = new LinkedList<>();
6	for (int[] p: people) ordered.add(p[1], p);
7
8	return ordered.toArray(new int[people.length][2]);
9    }
10}