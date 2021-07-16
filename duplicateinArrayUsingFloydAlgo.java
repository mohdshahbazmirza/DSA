class Solution {
    public int findDuplicate(int[] nums) {
        /*HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i]))
                return nums[i];
            else
                hmap.put(nums[i],1);
        }
        return -1;*/
        
        int slow=nums[nums[0]];
        int fast=nums[nums[nums[0]]];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        fast=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    
    }
}