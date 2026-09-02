// Last updated: 9/2/2026, 12:29:31 PM
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> res = new ArrayList<>();
4        int i = 1, fizz = 0, buzz = 0;
5        while (i <= n){
6            fizz++; buzz++;
7            if (fizz == 3 && buzz == 5) {
8                res.add("FizzBuzz");
9                fizz = buzz = 0;
10            } else if (fizz == 3) {
11                res.add("Fizz");
12                fizz = 0;
13            } else if (buzz == 5) {
14                res.add("Buzz");
15                buzz = 0;
16            } else {
17                res.add(String.valueOf(i));
18            }
19            i++;
20        }
21
22        return res;
23    }
24}