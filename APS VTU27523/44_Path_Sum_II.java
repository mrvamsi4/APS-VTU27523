import java.util.*;
class Solution {
    public List<List<Integer>> pathSum(TreeNode root,int targetSum){
        List<List<Integer>> ans=new ArrayList<>(); dfs(root,targetSum,new ArrayList<>(),ans);return ans;
    }
    private void dfs(TreeNode n,int sum,List<Integer> path,List<List<Integer>> ans){
        if(n==null)return;path.add(n.val);
        if(n.left==null&&n.right==null&&sum==n.val)ans.add(new ArrayList<>(path));
        else{dfs(n.left,sum-n.val,path,ans);dfs(n.right,sum-n.val,path,ans);}
        path.remove(path.size()-1);
    }
}
