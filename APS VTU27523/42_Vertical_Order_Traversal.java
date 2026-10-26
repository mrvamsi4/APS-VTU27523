import java.util.*;
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<int[]> nodes=new ArrayList<>(); dfs(root,0,0,nodes);
        nodes.sort((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]!=b[1]?a[1]-b[1]:a[2]-b[2]);
        List<List<Integer>> ans=new ArrayList<>(); int last=Integer.MIN_VALUE;
        for(int[] n:nodes){if(n[0]!=last){ans.add(new ArrayList<>());last=n[0];}ans.get(ans.size()-1).add(n[2]);}
        return ans;
    }
    private void dfs(TreeNode n,int x,int y,List<int[]> a){if(n==null)return;a.add(new int[]{x,y,n.val});dfs(n.left,x-1,y+1,a);dfs(n.right,x+1,y+1,a);}
}
