class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int pivot = 0;  
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] < nums[0]){
                pivot = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return nums[pivot];
        
    }
}
