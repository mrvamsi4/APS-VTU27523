class Solution {
    public String longestNiceSubstring(String s){return solve(s);}
    private String solve(String s){
        if(s.length()<2)return "";Set<Character>set=new HashSet<>();for(char c:s.toCharArray())set.add(c);
        for(int i=0;i<s.length();i++){char c=s.charAt(i);if(set.contains(Character.toLowerCase(c))&&set.contains(Character.toUpperCase(c)))continue;String a=solve(s.substring(0,i)),b=solve(s.substring(i+1));return a.length()>=b.length()?a:b;}
        return s;
    }
}
