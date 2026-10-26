import java.util.*;
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] f=new int[26]; for(char c:tasks)f[c-'A']++;
        Arrays.sort(f); int max=f[25], idle=(max-1)*n;
        for(int i=24;i>=0&&f[i]>0;i--) idle-=Math.min(max-1,f[i]);
        return tasks.length+Math.max(0,idle);
    }
}
