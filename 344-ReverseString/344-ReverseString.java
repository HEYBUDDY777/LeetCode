// Last updated: 9/2/2026, 12:13:16 PM
1class Solution {
2    public void reverseString(char[] s) {
3
4        int start = 0;
5        int end = s.length - 1;
6
7        while(start <= end){
8
9            char temp = s[start];
10            s[start] = s[end];
11            s[end] = temp;
12
13            start++;
14            end--;
15        }
16    }
17}