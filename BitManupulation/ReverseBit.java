public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        long sum=0;
        for(int i=1;i<=32;i++)
        {
            if((n&1)==1)
                sum+=Math.pow(2,32-i);
            n>>=1;
        }
        return (int)sum;
    }
}
