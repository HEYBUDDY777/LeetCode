// Last updated: 9/2/2026, 12:05:28 PM
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
17    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
18        List<TreeNode> res=new ArrayList<>();
19        HashMap<String,Integer> hm=new HashMap<>();
20        helper(res,root,hm);
21        return res;
22    }
23    public String helper(List<TreeNode> res,TreeNode root,HashMap<String,Integer> hm){
24        if(root==null)
25            return "";
26        String left=helper(res,root.left,hm);
27        String right=helper(res,root.right,hm);
28        int currroot=root.val;
29        String stringformed=currroot+"$"+left+"$"+right;
30        if(hm.getOrDefault(stringformed,0)==1){
31            res.add(root);
32        }
33        hm.put(stringformed,hm.getOrDefault(stringformed,0)+1);
34        return stringformed;
35    }
36}