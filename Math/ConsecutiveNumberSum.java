class Solution {
    public int consecutiveNumbersSum(int n) {
       int k=1;
        int count=0;
        while((2*n)>(k*(k-1)))
        {
            int numerator=n-(k*(k-1))/2;
            if(numerator%k==0)
                count++;
            k++;
        }
        return count;
    }
}
