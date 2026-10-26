import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>(); if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>(); q.offer(root);
        while(!q.isEmpty()) {
            int n=q.size(); List<Integer> level=new ArrayList<>();
            for(int i=0;i<n;i++){ TreeNode x=q.poll(); level.add(x.val); if(x.left!=null)q.offer(x.left); if(x.right!=null)q.offer(x.right); }
            ans.add(level);
        }
        return ans;
    }
}
