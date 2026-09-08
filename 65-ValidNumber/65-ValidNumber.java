// Last updated: 9/8/2026, 2:27:08 PM
1class Solution {
2    public boolean isNumber(String s) {
3        boolean digitseen = false;
4        boolean dotseen = false;
5        boolean eseen = false;
6        boolean digitAterE = true;
7        for(int i=0;i<s.length();i++)
8        {
9            char ch = s.charAt(i);
10            if(Character.isDigit(ch))
11            {
12                digitseen = true;
13                if(eseen)
14                {
15                    digitAterE = true;
16                }
17            }
18            else if(ch=='.')
19            {
20                if(dotseen || eseen){
21                    return false;
22                }
23                dotseen = true;
24            }
25            else if(ch=='e' ||ch=='E')
26            {
27                if(eseen || !digitseen)
28                {
29                    return false;
30                }
31                eseen = true;
32                digitAterE = false;
33            }
34            else if(ch=='+' ||ch=='-')
35            {
36                if(i!=0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E')
37                return false;
38            }
39            else{
40                return false;
41            }
42        }
43        return digitseen && digitAterE;
44    }
45}