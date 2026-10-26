import java.util.*;
class Solution {
    public int[] findOrder(int n,int[][] prerequisites){
        List<List<Integer>>g=new ArrayList<>();int[]in=new int[n];for(int i=0;i<n;i++)g.add(new ArrayList<>());
        for(int[]p:prerequisites){g.get(p[1]).add(p[0]);in[p[0]]++;}
        Queue<Integer>q=new LinkedList<>();for(int i=0;i<n;i++)if(in[i]==0)q.offer(i);int[]ans=new int[n];int i=0;
        while(!q.isEmpty()){int x=q.poll();ans[i++]=x;for(int y:g.get(x))if(--in[y]==0)q.offer(y);}return i==n?ans:new int[0];
    }
}
