class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        int ans[]=new int[nums.length];
        int ans1[]=new int[nums.length];
        int a=0;
        while(maximumBit-->0)
        {
            a=a<<1;
            a=a+1;
        }
        ans[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            ans[i]=ans[i-1]^nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            ans1[i]=ans[nums.length-i-1]^a;
        }
        return ans1;
    }
}
