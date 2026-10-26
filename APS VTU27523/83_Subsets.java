import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums){List<List<Integer>>a=new ArrayList<>();back(nums,0,new ArrayList<>(),a);return a;}
    private void back(int[]n,int i,List<Integer>p,List<List<Integer>>a){if(i==n.length){a.add(new ArrayList<>(p));return;}back(n,i+1,p,a);p.add(n[i]);back(n,i+1,p,a);p.remove(p.size()-1);}
}
