class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        if(x<0)
            return false;
        String s=new String(x+"");
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString().equals(s);
    }
}