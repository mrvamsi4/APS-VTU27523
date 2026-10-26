import java.util.*;
class Solution {
    public List<String> binaryTreePaths(TreeNode root){List<String>a=new ArrayList<>();if(root!=null)dfs(root,"",a);return a;}
    private void dfs(TreeNode n,String p,List<String>a){
        if(n.left==null&&n.right==null){a.add(p+n.val);return;}
        p+=n.val+"->";if(n.left!=null)dfs(n.left,p,a);if(n.right!=null)dfs(n.right,p,a);
    }
}
