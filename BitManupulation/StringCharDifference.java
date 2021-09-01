class Solution {
    public char findTheDifference(String s, String t) {
        char ans=0;
        String str=s+t;
        for(int i=0;i<str.length();i++)
        {
            ans^=str.charAt(i);
        }
        return ans;
    }
}
