import java.util.*;
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1,int[] nums2,int k){
        List<List<Integer>> ans=new ArrayList<>();if(nums1.length==0||nums2.length==0||k==0)return ans;
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->Integer.compare(nums1[a[0]]+nums2[a[1]],nums1[b[0]]+nums2[b[1]]));
        for(int i=0;i<Math.min(nums1.length,k);i++)q.offer(new int[]{i,0});
        while(k-->0&&!q.isEmpty()){int[] p=q.poll();ans.add(Arrays.asList(nums1[p[0]],nums2[p[1]]));if(p[1]+1<nums2.length)q.offer(new int[]{p[0],p[1]+1});}
        return ans;
    }
}
