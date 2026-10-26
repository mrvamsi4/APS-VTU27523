import java.util.*;
class Solution {
    public int kthSmallest(TreeNode root,int k){
        Deque<TreeNode>s=new ArrayDeque<>();TreeNode c=root;
        while(c!=null||!s.isEmpty()){while(c!=null){s.push(c);c=c.left;}c=s.pop();if(--k==0)return c.val;c=c.right;}return -1;
    }
}
