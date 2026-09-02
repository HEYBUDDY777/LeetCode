// Last updated: 9/2/2026, 11:39:34 AM
1/*
2// Definition for a QuadTree node.
3class Node {
4    public boolean val;
5    public boolean isLeaf;
6    public Node topLeft;
7    public Node topRight;
8    public Node bottomLeft;
9    public Node bottomRight;
10
11    
12    public Node() {
13        this.val = false;
14        this.isLeaf = false;
15        this.topLeft = null;
16        this.topRight = null;
17        this.bottomLeft = null;
18        this.bottomRight = null;
19    }
20    
21    public Node(boolean val, boolean isLeaf) {
22        this.val = val;
23        this.isLeaf = isLeaf;
24        this.topLeft = null;
25        this.topRight = null;
26        this.bottomLeft = null;
27        this.bottomRight = null;
28    }
29    
30    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
31        this.val = val;
32        this.isLeaf = isLeaf;
33        this.topLeft = topLeft;
34        this.topRight = topRight;
35        this.bottomLeft = bottomLeft;
36        this.bottomRight = bottomRight;
37    }
38}
39*/
40
41class Solution {
42  public Node construct(int[][] grid) {
43    return helper(grid, 0, 0, grid.length);
44  }
45
46  private Node helper(int[][] grid, int i, int j, int w) {
47    if (allSame(grid, i, j, w))
48      return new Node(grid[i][j] == 1 ? true : false, true);
49
50    Node node = new Node(true, false);
51    node.topLeft = helper(grid, i, j, w / 2);
52    node.topRight = helper(grid, i, j + w / 2, w / 2);
53    node.bottomLeft = helper(grid, i + w / 2, j, w / 2);
54    node.bottomRight = helper(grid, i + w / 2, j + w / 2, w / 2);
55    return node;
56  }
57
58  private boolean allSame(int[][] grid, int i, int j, int w) {
59    for (int x = i; x < i + w; ++x)
60      for (int y = j; y < j + w; ++y)
61        if (grid[x][y] != grid[i][j])
62          return false;
63    return true;
64  }
65}