class Solution {
    public int getLucky(String s, int k) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        int i=1;
        for(char ch='a';ch<='z';ch++)
        {
            hmap.put(ch,i);
            i++;
        }
        StringBuilder sb=new StringBuilder();
        for(i=0;i<s.length();i++)
        {
            sb.append(hmap.get(s.charAt(i))+"");
        }
        //int ans= Integer.parseInt(sb.toString());
        //int res=0;
        int ans=0;
        for(i=0;i<sb.length();i++)
        {
            //System.out.println(sb.charAt(i));
            ans+=Character.getNumericValue(sb.charAt(i));
        }
        k=k-1;
        while(k>0)
        {
            int res=ans;
            ans=0;
            while(res!=0)
            {
                ans+=res%10;
                res=res/10;
            }
            k--;
        }
            
        
        return ans;
    }
}