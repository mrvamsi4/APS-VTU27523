import java.util.*;
class Solution {
    public List<List<Integer>> combine(int n,int k){List<List<Integer>>a=new ArrayList<>();back(1,n,k,new ArrayList<>(),a);return a;}
    private void back(int start,int n,int k,List<Integer>p,List<List<Integer>>a){if(p.size()==k){a.add(new ArrayList<>(p));return;}for(int i=start;i<=n-(k-p.size())+1;i++){p.add(i);back(i+1,n,k,p,a);p.remove(p.size()-1);}}
}
