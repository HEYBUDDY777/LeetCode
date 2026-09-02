// Last updated: 9/2/2026, 12:11:27 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<String> binaryTreePaths(TreeNode root) {
18        List<String> res = new ArrayList<>();
19
20        if (root == null)
21            return res;
22
23        StringBuilder path = new StringBuilder();
24        path.append(root.val);
25        backtrack(root, path, res);
26
27        return res;
28    }
29
30    private void backtrack(TreeNode root, StringBuilder path, List<String> res) {
31        if (root.left == null && root.right == null) {
32            res.add(path.toString());
33            return;
34        }
35
36        int size = path.length();
37
38        if (root.left != null) {
39            path.append("->").append(root.left.val);
40            backtrack(root.left, path, res);
41            path.setLength(size);
42        }
43
44        if (root.right != null) {
45            path.append("->").append(root.right.val);
46            backtrack(root.right, path, res);
47            path.setLength(size);
48        }
49    }
50}