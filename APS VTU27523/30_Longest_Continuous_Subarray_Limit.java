import java.util.*;
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max=new ArrayDeque<>(), min=new ArrayDeque<>(); int l=0, ans=0;
        for(int r=0;r<nums.length;r++) {
            while(!max.isEmpty()&&nums[max.peekLast()]<nums[r]) max.pollLast();
            while(!min.isEmpty()&&nums[min.peekLast()]>nums[r]) min.pollLast();
            max.offerLast(r); min.offerLast(r);
            while((long)nums[max.peekFirst()]-(long)nums[min.peekFirst()]>limit) {
                if(max.peekFirst()==l) max.pollFirst(); if(min.peekFirst()==l) min.pollFirst(); l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
