// Last updated: 8/14/2026, 11:06:19 AM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char num = board[i][j];
                if(num== '.'){
                    continue;
                }
                String row = num+" in row "+i;
                String col = num+" in col "+j;
                String dia = num+" in box "+(i/3)+"-"+(j/3);

                if(set.contains(row)||set.contains(col)||set.contains(dia))
                {
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(dia);
            }
        }
        return true;
        
    }
}