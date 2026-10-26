import java.util.*;
class Solution {
    public boolean canFinish(int n,int[][] prerequisites){
        List<List<Integer>>g=new ArrayList<>();int[]in=new int[n];for(int i=0;i<n;i++)g.add(new ArrayList<>());
        for(int[]p:prerequisites){g.get(p[1]).add(p[0]);in[p[0]]++;}
        Queue<Integer>q=new LinkedList<>();for(int i=0;i<n;i++)if(in[i]==0)q.offer(i);int count=0;
        while(!q.isEmpty()){int x=q.poll();count++;for(int y:g.get(x))if(--in[y]==0)q.offer(y);}return count==n;
    }
}
