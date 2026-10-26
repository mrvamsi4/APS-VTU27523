import java.util.*;
class Solution {
    public int[] shortestAlternatingPaths(int n,int[][] redEdges,int[][] blueEdges){
        List<Integer>[][]g=new ArrayList[2][n];for(int c=0;c<2;c++)for(int i=0;i<n;i++)g[c][i]=new ArrayList<>();
        for(int[]e:redEdges)g[0][e[0]].add(e[1]);for(int[]e:blueEdges)g[1][e[0]].add(e[1]);
        int[][]d=new int[n][2];for(int[]x:d)Arrays.fill(x,-1);Queue<int[]>q=new LinkedList<>();q.offer(new int[]{0,0});q.offer(new int[]{0,1});d[0][0]=d[0][1]=0;
        while(!q.isEmpty()){int[]p=q.poll();int node=p[0],last=p[1],next=1-last;for(int v:g[next][node])if(d[v][next]==-1){d[v][next]=d[node][last]+1;q.offer(new int[]{v,next});}}
        int[]ans=new int[n];for(int i=0;i<n;i++){int a=d[i][0],b=d[i][1];ans[i]=a==-1?b:b==-1?a:Math.min(a,b);}return ans;
    }
}
