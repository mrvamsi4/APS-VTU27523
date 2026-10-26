import java.util.*;
class Solution {
    public int numUniqueEmails(String[] emails){
        Set<String>s=new HashSet<>();for(String e:emails){String[]p=e.split("@");String local=p[0].split("\\+")[0].replace(".","");s.add(local+"@"+p[1]);}return s.size();
    }
}
