// Last updated: 9/2/2026, 12:18:38 PM
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        long ans = 0;
4
5        for (int i = 0; i < columnTitle.length(); i++) {
6            char ch = columnTitle.charAt(i);
7            ans = ans * 26 + (ch - 'A' + 1);
8        }
9
10        return (int) ans;
11    }
12}