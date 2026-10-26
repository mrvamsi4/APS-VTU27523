import java.util.*;
class Solution {
    public int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> q=new PriorityQueue<>();for(int x:nums){q.offer(x);if(q.size()>k)q.poll();}return q.peek();
    }
}
