class Solution {
    public int maxProfit(int[] prices) {
       int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i< prices.length;i++)
        {
            if(min>prices[i])
                min=prices[i];
            max=Math.max(max,prices[i]-min);
        }
        if(max<0)
            return 0;
        return max;
    }
}