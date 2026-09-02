// Last updated: 9/2/2026, 12:22:38 PM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder title=new StringBuilder();
4
5        while(columnNumber>0){
6            columnNumber--;
7            int r=columnNumber%26;
8
9            title.append((char)(r+'A'));
10
11            columnNumber=columnNumber/26;
12        }
13        return title.reverse().toString();
14    }
15}