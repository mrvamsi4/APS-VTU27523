import java.util.*;
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts){
        Map<String,String> owner=new HashMap<>();Map<String,Set<String>>g=new HashMap<>();
        for(List<String>a:accounts){String name=a.get(0);for(int i=1;i<a.size();i++){String e=a.get(i);owner.put(e,name);g.computeIfAbsent(e,k->new HashSet<>());if(i>1){String prev=a.get(i-1);g.get(e).add(prev);g.get(prev).add(e);}}}
        Set<String>seen=new HashSet<>();List<List<String>>ans=new ArrayList<>();
        for(String e:g.keySet())if(seen.add(e)){List<String>emails=new ArrayList<>();Deque<String>s=new ArrayDeque<>();s.push(e);while(!s.isEmpty()){String x=s.pop();emails.add(x);for(String y:g.get(x))if(seen.add(y))s.push(y);}Collections.sort(emails);List<String>row=new ArrayList<>();row.add(owner.get(e));row.addAll(emails);ans.add(row);}
        return ans;
    }
}
