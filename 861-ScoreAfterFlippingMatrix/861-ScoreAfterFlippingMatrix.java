// Last updated: 9/8/2026, 10:33:41 AM
1class Solution {
2    public int matrixScore(int[][] grid) {
3        int row = grid.length;
4        int col = grid[0].length;
5        for(int i=0;i<row;i++)
6        {
7            if(grid[i][0]==0)
8            {
9                for(int j=0;j<col;j++)
10                {
11                    grid[i][j] ^= 1;
12                }
13            }
14        }
15        int score = 0;
16        for(int j=0;j<col;j++)
17        {
18            int ones = 0;
19            for(int i=0;i<row;i++)
20            {
21                if(grid[i][j]==1)
22                ones++;
23            }
24            int maxones = Math.max(ones,row-ones);
25            score += maxones *(1<<col-1-j);
26        }
27        return score;
28    }
29}