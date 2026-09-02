// Last updated: 9/2/2026, 11:44:58 AM
1class MyCircularDeque {
2    private int front, rear, size, cap;
3    private int[] arr;
4
5    public MyCircularDeque(int k) {
6        arr = new int[k];
7        this.cap = k;
8        front = -1;
9        rear = -1;
10        size = 0;
11    }
12    
13    public boolean insertFront(int value) {
14        if (isFull()) return false;
15        
16        if (isEmpty()) {
17            front = rear = 0; // Initialize first element placement 📍
18        } else if (front == 0) {
19            front = cap - 1;  // Wrap around to the back edge 🎡
20        } else {
21            front--;          // Step backward normally
22        }
23        
24        arr[front] = value;
25        size++;
26        return true;
27    }
28    
29    public boolean insertLast(int value) {
30        if (isFull()) return false;
31        
32        if (isEmpty()) {
33            front = rear = 0; 
34        } else if (rear == cap - 1) {
35            rear = 0;         
36        } else {
37            rear++;          
38        }
39        
40        arr[rear] = value;
41        size++;
42        return true;
43    }
44    
45    public boolean deleteFront() {
46        if (isEmpty()) return false;
47        
48        if (size == 1) {
49            front = rear = -1; 
50        } else if (front == cap - 1) {
51            front = 0;         
52        } else {
53            front++;           
54        }
55        
56        size--;
57        return true;
58    }
59    
60    public boolean deleteLast() {
61        if (isEmpty()) return false;
62        
63        if (size == 1) {
64            front = rear = -1; 
65        } else if (rear == 0) {
66            rear = cap - 1;    
67        } else {
68            rear--;            
69        }
70        
71        size--;
72        return true;
73    }
74    
75    public int getFront() {
76        if (isEmpty()) return -1;
77        return arr[front];
78    }
79    
80    public int getRear() {
81        if (isEmpty()) return -1;
82        return arr[rear];
83    }
84    
85    public boolean isEmpty() {
86        return size == 0;
87    }
88    
89    public boolean isFull() {
90        return size == cap;
91    }
92}
93
94/**
95 * Your MyCircularDeque object will be instantiated and called as such:
96 * MyCircularDeque obj = new MyCircularDeque(k);
97 * boolean param_1 = obj.insertFront(value);
98 * boolean param_2 = obj.insertLast(value);
99 * boolean param_3 = obj.deleteFront();
100 * boolean param_4 = obj.deleteLast();
101 * int param_5 = obj.getFront();
102 * int param_6 = obj.getRear();
103 * boolean param_7 = obj.isEmpty();
104 * boolean param_8 = obj.isFull();
105 */