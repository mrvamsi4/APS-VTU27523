import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points,int k){
        PriorityQueue<int[]>q=new PriorityQueue<>((a,b)->Long.compare(dist(b),dist(a)));
        for(int[]p:points){q.offer(p);if(q.size()>k)q.poll();}
        int[][]ans=new int[k][];for(int i=0;i<k;i++)ans[i]=q.poll();return ans;
    }
    private long dist(int[]p){return (long)p[0]*p[0]+(long)p[1]*p[1];}
}
