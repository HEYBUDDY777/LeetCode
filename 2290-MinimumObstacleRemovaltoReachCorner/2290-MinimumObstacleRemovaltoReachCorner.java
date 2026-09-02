// Last updated: 9/2/2026, 11:29:43 AM
1class Solution {
2     public int minimumObstacles(int[][] g){
3        int n = g.length, m = g[0].length, dist[][] = new int[n][m], dirs[] = {-1, 0, 1, 0, -1};
4        Arrays.stream(dist).forEach(row -> Arrays.fill(row, Integer.MAX_VALUE));
5        Queue<int[]> q = new LinkedList<>();
6        for(dist[0][0] = g[0][0], q.offer(new int[]{0, 0}); !q.isEmpty(); )
7            for(int i = 1, p[] = q.poll(), x = p[0], y = p[1]; i < dirs.length; i++){
8                int nx = x + dirs[i - 1], ny = y + dirs[i];
9                if(0 <= nx && nx < n && 0 <= ny && ny < m && dist[x][y] + g[nx][ny] < dist[nx][ny]){
10                    dist[nx][ny] = dist[x][y] + g[nx][ny];
11                    q.offer(new int[]{nx, ny});
12                }
13            }
14        return dist[n - 1][m - 1];
15    }
16}