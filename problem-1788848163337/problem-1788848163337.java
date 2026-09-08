// Last updated: 9/8/2026, 11:46:03 AM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int row = matrix.length;
4        int col = matrix[0].length;
5        int[][] result = new int[col][row];
6        for(int i=0;i<row;i++)
7        {
8            for(int j=0;j<col;j++)
9            {
10                result[j][i] = matrix[i][j];
11            }
12        }
13        return result;
14    }
15}