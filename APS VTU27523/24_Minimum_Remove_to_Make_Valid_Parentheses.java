class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] a=s.toCharArray(); int open=0;
        for(int i=0;i<a.length;i++) {
            if(a[i]=='(') open++;
            else if(a[i]==')') { if(open==0) a[i]=' '; else open--; }
        }
        for(int i=a.length-1;i>=0 && open>0;i--) if(a[i]=='(') { a[i]=' '; open--; }
        StringBuilder b=new StringBuilder();
        for(char c:a) if(c!=' ') b.append(c);
        return b.toString();
    }
}
