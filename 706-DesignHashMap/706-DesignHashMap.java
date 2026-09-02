// Last updated: 9/2/2026, 12:08:25 PM
1class Node {
2    int key;
3    int val;
4    Node next;
5
6    Node(int key, int val) {
7        this.key = key;
8        this.val = val;
9        this.next = null;
10    }
11}
12
13class MyHashMap {
14
15    private Node[] map;
16
17    public MyHashMap() {
18        map = new Node[1000];
19        for (int i = 0; i < 1000; i++) {
20            map[i] = new Node(-1, -1);
21        }
22    }
23
24    public void put(int key, int value) {
25        int hash = hash(key);
26        Node cur = map[hash];
27
28        while (cur.next != null) {
29            if (cur.next.key == key) {
30                cur.next.val = value;
31                return;
32            }
33            cur = cur.next;
34        }
35
36        cur.next = new Node(key, value);
37    }
38
39    public int get(int key) {
40        int hash = hash(key);
41        Node cur = map[hash].next;
42
43        while (cur != null) {
44            if (cur.key == key)
45                return cur.val;
46            cur = cur.next;
47        }
48
49        return -1;
50    }
51
52    public void remove(int key) {
53        int hash = hash(key);
54        Node cur = map[hash];
55
56        while (cur.next != null) {
57            if (cur.next.key == key) {
58                cur.next = cur.next.next;
59                return;
60            }
61            cur = cur.next;
62        }
63    }
64
65    private int hash(int key) {
66        return key % 1000;
67    }
68}
69
70/**
71 * Your MyHashMap object will be instantiated and called as such:
72 * MyHashMap obj = new MyHashMap();
73 * obj.put(key,value);
74 * int param_2 = obj.get(key);
75 * obj.remove(key);
76 */