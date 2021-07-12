class Solution {
    static int sqrt(long n,long i)
    {
        if(i*i==n) return (int)i;
        if(i*i>n) return (int)(i-1);
        return sqrt(n,i+1);
    }
    public int mySqrt(int x) {
          if(x==0) return 0;
          return sqrt(x,1);
    }
}