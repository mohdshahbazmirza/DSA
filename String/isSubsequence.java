class Solution {
    public boolean isSubsequence(String s, String t) {
        
        for(char c: s.toCharArray())
        {
            if(!t.contains(String.valueOf(c))) return false;
            int a=t.indexOf(String.valueOf(c));
            t=t.substring(a+1);
        }
        return true;
    }
}