// Last updated: 9/1/2026, 10:31:38 AM
1class MyHashSet {
2    boolean[] set;
3    public MyHashSet() {
4       set = new boolean[1000001]; 
5    }
6    
7    public void add(int key) {
8        set[key] = true;
9    }
10    
11    public void remove(int key) {
12        set[key] = false;
13    }
14    
15    public boolean contains(int key) {
16        return set[key];
17    }
18}
19
20/**
21 * Your MyHashSet object will be instantiated and called as such:
22 * MyHashSet obj = new MyHashSet();
23 * obj.add(key);
24 * obj.remove(key);
25 * boolean param_3 = obj.contains(key);
26 */