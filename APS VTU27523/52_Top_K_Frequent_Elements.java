import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums,int k){
        Map<Integer,Integer> f=new HashMap<>();for(int x:nums)f.put(x,f.getOrDefault(x,0)+1);
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->f.get(a)-f.get(b));
        for(int x:f.keySet()){q.offer(x);if(q.size()>k)q.poll();}
        int[] ans=new int[k];for(int i=k-1;i>=0;i--)ans[i]=q.poll();return ans;
    }
}
