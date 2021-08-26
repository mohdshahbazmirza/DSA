class Solution {
    public int[] countBits(int n) {
        
        int arr[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            int count=0;
            int k=i;
            while(k!=0)
            {
                if((k&1)==1)
                    count++;
                k=k>>1;
            }
            arr[i]=count;
        }
        return arr;
    }
}
