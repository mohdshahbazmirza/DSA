class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hmap=new HashMap<>();
        HashMap<Character,Character> hmap1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hmap.containsKey(s.charAt(i)))
            {
                if(hmap.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else if(hmap.containsValue(t.charAt(i)))
            {
                    return false;
            }
            hmap.put(s.charAt(i),t.charAt(i));
        }
        
        return true;
        
    }
}