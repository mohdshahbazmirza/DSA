class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
        {
            min=Math.min(min,strs[i].length());
        }
        for(int i=0;i<min;i++)
        {
            char ch=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++)
            {
                if(ch!=strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}