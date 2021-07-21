class Solution {
    public int reverse(int x) {
        long ans=0;
        while(x!=0)
        {
            int temp=x%10;
            ans=ans*10+temp;
            x=x/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)
            return 0;
        return (int)ans;
    }
}