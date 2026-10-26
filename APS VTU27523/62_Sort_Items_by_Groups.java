import java.util.*;
class Solution {
    public int[] sortItems(int n,int m,int[] group,List<List<Integer>> beforeItems){
        for(int i=0;i<n;i++)if(group[i]==-1)group[i]=m++;
        List<Set<Integer>> itemG=new ArrayList<>(), groupG=new ArrayList<>();
        int[] itemIn=new int[n],groupIn=new int[m];
        for(int i=0;i<n;i++)itemG.add(new HashSet<>());for(int i=0;i<m;i++)groupG.add(new HashSet<>());
        for(int i=0;i<n;i++)for(int b:beforeItems.get(i)){
            if(itemG.get(b).add(i))itemIn[i]++;
            if(group[b]!=group[i]&&groupG.get(group[b]).add(group[i]))groupIn[group[i]]++;
        }
        List<Integer> items=topo(itemG,itemIn), groups=topo(groupG,groupIn);
        if(items.size()!=n||groups.size()!=m)return new int[0];
        List<List<Integer>> bucket=new ArrayList<>();for(int i=0;i<m;i++)bucket.add(new ArrayList<>());
        for(int x:items)bucket.get(group[x]).add(x);
        int[] ans=new int[n];int k=0;for(int g:groups)for(int x:bucket.get(g))ans[k++]=x;return ans;
    }
    private List<Integer> topo(List<Set<Integer>>g,int[]in){
        Queue<Integer>q=new LinkedList<>();for(int i=0;i<in.length;i++)if(in[i]==0)q.offer(i);
        List<Integer>a=new ArrayList<>();while(!q.isEmpty()){int x=q.poll();a.add(x);for(int y:g.get(x))if(--in[y]==0)q.offer(y);}return a;
    }
}
