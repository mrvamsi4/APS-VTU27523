class Solution {
    int best=0;
    public int diameterOfBinaryTree(TreeNode root){depth(root);return best;}
    private int depth(TreeNode n){if(n==null)return 0;int l=depth(n.left),r=depth(n.right);best=Math.max(best,l+r);return 1+Math.max(l,r);}
}
