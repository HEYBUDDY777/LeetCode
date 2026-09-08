// Last updated: 9/8/2026, 12:09:21 PM
1class Solution {
2    public boolean lemonadeChange(int[] bills) {
3        int five = 0,ten=0;
4        for(int i=0;i<bills.length;i++)
5        {
6            if(bills[i]==5) {
7                five++;
8            }
9
10            else if(bills[i]==10){
11                 if(five==0)
12                 {
13                    return false;
14                 }
15                 five--;
16                 ten++;
17            }
18            else {
19                if (ten > 0 && five > 0) {
20                    ten--;
21                    five--;
22                }
23                else if (five >= 3) {
24                    five -= 3;
25                }
26
27                else {
28                    return false;
29                }
30            }
31        }
32        return true;
33    }
34}