class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++)
        {
            int mid=i+1;
            int end=nums.length-1;
            while(mid<end)
            {
                int sum=nums[i]+nums[mid]+nums[end];
                if(sum<target)
                    mid++;
                else
                    end--;
                if(Math.abs(res-target)>Math.abs(sum-target))
                    res=sum;
            }
        }
        return res;
    }
}