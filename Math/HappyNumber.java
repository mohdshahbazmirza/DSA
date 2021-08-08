class Solution {
    public static int squareOfDigit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int a=n%10;
            sum+=a*a;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        
        Set<Integer> s=new HashSet<>();
        while(n!=1)
        {
            n=squareOfDigit(n);
            if(s.contains(n))
                return false;
            s.add(n);
        }
        return true;
    }
}