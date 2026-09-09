// Last updated: 9/9/2026, 12:05:13 PM
class Solution {
     public int minimumObstacles(int[][] g){
        int n = g.length, m = g[0].length, dist[][] = new int[n][m], dirs[] = {-1, 0, 1, 0, -1};
        Arrays.stream(dist).forEach(row -> Arrays.fill(row, Integer.MAX_VALUE));
        Queue<int[]> q = new LinkedList<>();
        for(dist[0][0] = g[0][0], q.offer(new int[]{0, 0}); !q.isEmpty(); )
            for(int i = 1, p[] = q.poll(), x = p[0], y = p[1]; i < dirs.length; i++){
                int nx = x + dirs[i - 1], ny = y + dirs[i];
                if(0 <= nx && nx < n && 0 <= ny && ny < m && dist[x][y] + g[nx][ny] < dist[nx][ny]){
                    dist[nx][ny] = dist[x][y] + g[nx][ny];
                    q.offer(new int[]{nx, ny});
                }
            }
        return dist[n - 1][m - 1];
    }
}