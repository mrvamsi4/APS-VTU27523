import java.util.*;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>a=new ArrayList<>(); if(root==null)return a; Deque<TreeNode>s=new ArrayDeque<>();s.push(root);
        while(!s.isEmpty()){TreeNode n=s.pop();a.add(n.val);if(n.right!=null)s.push(n.right);if(n.left!=null)s.push(n.left);}return a;
    }
}
