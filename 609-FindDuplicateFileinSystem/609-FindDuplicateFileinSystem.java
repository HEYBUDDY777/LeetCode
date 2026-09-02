// Last updated: 9/2/2026, 11:59:57 AM
1class Solution {
2    public List<List<String>> findDuplicate(String[] paths) {
3        List<List<String>> al = new ArrayList<>();
4        HashMap<String, List<String>> hashmap = new HashMap<>();
5        for(String path : paths) {
6            String[] arr = path.split("\\ ");
7            String dirPath = arr[0];
8            for(int i = 1; i < arr.length; i++) {
9                StringBuilder content = new StringBuilder();
10                int j = 0;
11                for(j = arr[i].length() - 2; j >= 0 && arr[i].charAt(j) != '('; j--) {
12                    content.insert(0, arr[i].charAt(j));
13                }
14                
15                String fileName = arr[i].substring(0, j);
16                hashmap.putIfAbsent(content.toString(), new ArrayList<>());
17                hashmap.get(content.toString()).add(dirPath + "/" + fileName);
18            }
19        }
20        
21        for(String string : hashmap.keySet()) {
22            if(hashmap.get(string).size() >= 2) {
23                al.add(new ArrayList<>(hashmap.get(string)));
24            }
25        }
26        return al;
27    }
28}