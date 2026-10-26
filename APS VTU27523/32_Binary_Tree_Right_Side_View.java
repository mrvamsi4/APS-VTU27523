import java.util.*;
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>(); if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>(); q.offer(root);
        while(!q.isEmpty()){ int n=q.size(); for(int i=0;i<n;i++){ TreeNode x=q.poll(); if(i==n-1)ans.add(x.val); if(x.left!=null)q.offer(x.left); if(x.right!=null)q.offer(x.right); } }
        return ans;
    }
}
