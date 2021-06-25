class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,max=0;
        HashMap<Character,Integer> hmap=new HashMap<>();
        
        while(r<s.length())
        {
            if(hmap.containsKey(s.charAt(r)))
            {
                l=Math.max(hmap.get(s.charAt(r))+1,l);
            }
            hmap.put(s.charAt(r),r);
            max=Math.max(r-l+1,max);
            r++;
        }
        return max;
        
    }
}