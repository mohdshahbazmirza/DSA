class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;  
        for(int i=0;i<k;i++)
        {
            int index=0;
            for(int j=0;j<n-i;j++)
            {
                if(nums[index]<=nums[j])
                {
                    index=j;  
                }   
            }
            nums[index]=(nums[index]+nums[n-i-1])-(nums[n-i-1]=nums[index]);
        }
        for(int i=0;i<n;i++)
            System.out.print(" "+nums[i]);
        return nums[n-k];
    }
}