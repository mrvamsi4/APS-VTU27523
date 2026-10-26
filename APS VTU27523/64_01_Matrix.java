import java.util.*;
class Solution {
    public int[][] updateMatrix(int[][] mat){
        int m=mat.length,n=mat[0].length;Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<m;i++)for(int j=0;j<n;j++)if(mat[i][j]==0)q.offer(new int[]{i,j});else mat[i][j]=-1;
        int[][]d={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){int[]p=q.poll();for(int[]v:d){int r=p[0]+v[0],c=p[1]+v[1];if(r>=0&&r<m&&c>=0&&c<n&&mat[r][c]==-1){mat[r][c]=mat[p[0]][p[1]]+1;q.offer(new int[]{r,c});}}}return mat;
    }
}
