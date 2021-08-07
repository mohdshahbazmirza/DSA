class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //Arrays.sort(nums);
        int ans[]=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j] && i!=j)
                    count++;
            }
            ans[i]=count;
            count=0;
        }
        return ans;
    }
}