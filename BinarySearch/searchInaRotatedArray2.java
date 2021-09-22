class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<=end)
        {
             mid=(start+end)/2;
            if(nums[mid]==target) return true;
            if(nums[start]==nums[mid] && nums[start]==nums[end])
            {
                start++;
                end--;
            }
            else if(nums[start]<=nums[mid])
            {
                if(target>=nums[start] && target<=nums[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(target>=nums[mid] && target<=nums[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return false;
    }
}
