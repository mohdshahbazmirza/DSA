class Solution {
    public double myPow(double x, int n) {
        
        if(n==0) return 1;
        if(n%2==0) return myPow(x*x,n/2);
        if(n%2==1) return x*myPow(x,n-1);
        if(n<0) return myPow(1/x,-n);
        return 0;
    }
}