class Solution {
    public int romanToInt(String s) {
        int n=s.length(),number=0;
        for(int i=n-1;i>=0;i--)
        {
            
            if(s.charAt(i)=='I')
            {
                if(s.charAt(i+1)=='V')
                   number=number-1;
                else if(s.charAt(i+1)=='X')
                    number=number-1;
                else
                    number++;
            }
            else if(s.charAt(i)=='V')
                    number=number+5;
            else if(s.charAt(i)=='X')
            {
                if(s.charAt(i+1)=='L')
                   number=number-10;
                else if(s.charAt(i+1)=='C')
                    number=number-10;
                else
                    number=number+10;
            }
            else if(s.charAt(i)=='L')
                    number=number+50;
            else if(s.charAt(i)=='C')
            {
                if(s.charAt(i+1)=='D')
                   number=number-100;
                else if(s.charAt(i+1)=='M')
                    number=number-100;
                else
                    number=number+100;
            }
            else if(s.charAt(i)=='D')
                number=number+500;
            else
                number=number+1000;
            
            }

        return number;
    }
}