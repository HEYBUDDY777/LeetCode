// Last updated: 9/2/2026, 12:03:55 PM
1class Solution {
2    public String[] findRestaurant(String[] list1, String[] list2) {
3        HashMap<String, Integer> map1 = new HashMap<>();
4        HashMap<String, Integer> map2 = new HashMap<>();
5        List<String> val = new ArrayList<>();
6        int minIndexSum = Integer.MAX_VALUE;
7
8        for (int i = 0; i < list1.length; i++) {
9            map1.put(list1[i], i);
10        }
11
12        for (int j = 0; j < list2.length; j++) {
13            map2.put(list2[j], j);
14
15            if (map1.containsKey(list2[j])) {
16                int currentIndexSum = j + map1.get(list2[j]);
17
18                if (currentIndexSum < minIndexSum) {
19                    minIndexSum = currentIndexSum;
20                    val.clear();
21                    val.add(list2[j]);
22                } else if (currentIndexSum == minIndexSum) {
23                    val.add(list2[j]);
24                }
25            }
26        }
27
28        return val.toArray(new String[0]);
29    }
30}