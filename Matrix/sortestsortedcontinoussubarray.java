class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int n=nums.length;
        int start=0;
        int end=0;
        int min=Integer.MAX_VALUE;
        Boolean flag=false;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                flag=true;
                if(flag)
                    min=Math.min(min,nums[i+1]);
                
            }
        }
        flag=false;
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]<nums[i-1])
            {
                flag=true;
                if(flag)
                    max=Math.max(max,nums[i-1]);
                
            }
        }
        System.out.println(min+" "+max);
        for(int i=0;i<n;i++)
        {
            if(min<nums[i])
            {
                start=i;
                break;
            }
                
        }
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]<max)
            {
                end=i;
                break;
            }
        }
        System.out.println(start+" "+end);
        return (end-start<=0)?0:end-start+1;
    }
}