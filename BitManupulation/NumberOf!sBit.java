public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0,i=32;
        while(n!=0 && i-->0){
            if((n&1)==1){
                count++;
            }
             n>>=1;
        }
        return count;
    }
}
