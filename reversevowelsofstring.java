class Solution {
    public String reverseVowels(String s) {
        int l=s.length()-1;
        int i=0;
        Set<Character> vowels=new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        char ch[]=s.toCharArray();
        while(i<l)
        {
            while(i<l && !vowels.contains(ch[i]))
                i++;
            while(i<l && !vowels.contains(ch[l]))
                l--;
            char temp=ch[i];
            ch[i]=ch[l];
            ch[l]=temp;
            i++;
            l--;
        }
        return new String(ch);
    }
}