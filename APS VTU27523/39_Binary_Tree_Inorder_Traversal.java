import java.util.*;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>(); Deque<TreeNode>s=new ArrayDeque<>(); TreeNode c=root;
        while(c!=null||!s.isEmpty()){while(c!=null){s.push(c);c=c.left;}c=s.pop();a.add(c.val);c=c.right;}
        return a;
    }
}
