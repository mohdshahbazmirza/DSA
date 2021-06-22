class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid=nums.length/2,start=0,end=nums.length-1;
        while(start<=end)
        {
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
            mid=(start+end)/2;
        }
        return (nums[mid]>target)? mid:mid+1;
    }
}