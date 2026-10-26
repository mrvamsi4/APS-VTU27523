import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums){List<List<Integer>>a=new ArrayList<>();back(nums,new boolean[nums.length],new ArrayList<>(),a);return a;}
    private void back(int[]n,boolean[]used,List<Integer>p,List<List<Integer>>a){if(p.size()==n.length){a.add(new ArrayList<>(p));return;}for(int i=0;i<n.length;i++)if(!used[i]){used[i]=true;p.add(n[i]);back(n,used,p,a);p.remove(p.size()-1);used[i]=false;}}
}
