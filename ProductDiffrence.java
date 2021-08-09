class Solution {
    public int maxProductDifference(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++)
            for(int j=i+1;j<nums.length;j++){
                max=Math.max(max,nums[j]*nums[i]);
                min=Math.min(min,nums[j]*nums[i]);
            }
        return max-min;
    }
}