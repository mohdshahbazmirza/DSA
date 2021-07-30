class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n=nums.length;
        int ans[]=new int[n];
        ans[n-2]=nums[n-1];
        for(int i=n-3;i>=0;i--)
        {
            ans[i]=ans[i+1]*nums[i+1];
        }
        for(int i=1;i<n;i++)
        {
            nums[i]=nums[i-1]*nums[i];
        }
        ans[n-1]=nums[n-2];
        for(int i=1;i<=n-2;i++)
            ans[i]*=nums[i-1];
        return ans;
    }
}