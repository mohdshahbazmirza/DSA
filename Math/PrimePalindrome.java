class Solution {
    public boolean prime(int n)
    {
        if(n%2==0) return false;
        for(int i=3;i<n/2+1;i=i+2)
            if(n%i==0)
                return false;
        
        return true;
    }
    public boolean palindrome(int n)
    {
        if(n%10==0 && n!=0)
            return false;
        int rev=0;
        int temp=n;
        while(temp!=0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        return rev==n || n==rev/10;
    }
    public int primePalindrome(int n) {
        
        if(n==1 || n==2)
            return 2;
        if(n%2==0) n=n+1;
        while(true)
        {
            if(prime(n) && palindrome(n))
                return n;
            n=n+2;
            if (10000000 < n && n < 100000000)
                n = 100000001;
        }
        
    }
}