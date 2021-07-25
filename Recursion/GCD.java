public class Solution {
    public int gcd(int A, int B) {
        
        return calGcd(A,B);
    
    }
    
    public int calGcd(int a,int b){
        if(a==0) return b;
        return calGcd(b%a,a);
    }
}
