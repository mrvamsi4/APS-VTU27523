import java.util.*;
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>a=new ArrayList<>(); if(root==null)return a; Deque<TreeNode>s=new ArrayDeque<>();s.push(root);
        while(!s.isEmpty()){TreeNode n=s.pop();a.add(n.val);if(n.left!=null)s.push(n.left);if(n.right!=null)s.push(n.right);}Collections.reverse(a);return a;
    }
}
