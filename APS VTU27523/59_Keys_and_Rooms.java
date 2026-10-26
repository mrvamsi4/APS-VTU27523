import java.util.*;
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        boolean[] seen=new boolean[rooms.size()];Deque<Integer>s=new ArrayDeque<>();s.push(0);seen[0]=true;int count=0;
        while(!s.isEmpty()){int x=s.pop();count++;for(int k:rooms.get(x))if(!seen[k]){seen[k]=true;s.push(k);}}return count==rooms.size();
    }
}
