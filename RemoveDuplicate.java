class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int temp=nums[0],k=0;
        for(int i=0;i<nums.length;i++){
            if(temp!=nums[i])
            {
                temp=nums[i];
                k++;
            }
            nums[k]=temp;
        }
        return k+1;
        
    }
}