class Solution {
    public int findJudge(int n,int[][] trust){
        int[] d=new int[n+1];for(int[]t:trust){d[t[0]]--;d[t[1]]++;}
        for(int i=1;i<=n;i++)if(d[i]==n-1)return i;return -1;
    }
}
