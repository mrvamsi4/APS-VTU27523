import java.util.*;
class Solution {
    public boolean validPath(int n,int[][] edges,int source,int destination){
        List<List<Integer>> g=new ArrayList<>();for(int i=0;i<n;i++)g.add(new ArrayList<>());
        for(int[]e:edges){g.get(e[0]).add(e[1]);g.get(e[1]).add(e[0]);}
        boolean[] seen=new boolean[n];Queue<Integer>q=new LinkedList<>();q.offer(source);seen[source]=true;
        while(!q.isEmpty()){int x=q.poll();if(x==destination)return true;for(int y:g.get(x))if(!seen[y]){seen[y]=true;q.offer(y);}}return false;
    }
}
