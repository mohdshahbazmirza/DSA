class Solution {
    public int countPrimes(int n) {
        int ar[]=new int[n];
        Arrays.fill(ar,1);
        for(int i=2;i*i<n;i++)
        {
            int k=2;
            while(i*k<n)
            {
                ar[i*k]=0;
                k++;
            }
        }
        int count=0;
        for(int i=2;i<n;i++)
            if(ar[i]==1)
                count++;
        return count;
    }
}