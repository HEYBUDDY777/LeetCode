// Last updated: 8/14/2026, 10:52:54 AM
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return ans;
        q.add(root);
        boolean lefttoright = true;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                
                if(lefttoright){
                    l.add(node.val);
                }
                else{
                    l.add(0,node.val);
                }
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            lefttoright = !lefttoright;
            ans.add(l);
        }
        return ans;
    }
}