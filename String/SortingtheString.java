class Solution {
    public String sortSentence(String s) {
        
        StringBuilder sb=new StringBuilder();
        
        String str[]=s.split("\\s");
        String str1[]=new String[str.length+1];
        for(int i=0;i<str.length;i++)
        {
            char ch=str[i].charAt(str[i].length()-1);
            int a=ch-'0';
            str1[a]=str[i].substring(0,str[i].length()-1);
        }
        for(int i=1;i<str1.length-1;i++)
        {
            sb.append(str1[i]+" ");
        }
        sb.append(str1[str1.length-1]);
        return sb.toString();
    }
}
