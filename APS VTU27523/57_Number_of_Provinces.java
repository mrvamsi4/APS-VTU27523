class Solution {
    public int findCircleNum(int[][] isConnected){
        int n=isConnected.length,ans=0;boolean[] seen=new boolean[n];
        for(int i=0;i<n;i++)if(!seen[i]){ans++;dfs(i,isConnected,seen);}return ans;
    }
    private void dfs(int i,int[][]g,boolean[]s){s[i]=true;for(int j=0;j<g.length;j++)if(g[i][j]==1&&!s[j])dfs(j,g,s);}
}
