class Solution {
    public boolean isValid(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)==')'&& sb.length()!=0 && sb.charAt(sb.length()-1)=='(')
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else if(s.charAt(i)=='}'&& sb.length()!=0 && sb.charAt(sb.length()-1)=='{')
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else if(s.charAt(i)==']'&& sb.length()!=0 && sb.charAt(sb.length()-1)=='[')
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else
                return false;
        }
        if(sb.length()==0)
            return true;
        else
        return false;
    }
}