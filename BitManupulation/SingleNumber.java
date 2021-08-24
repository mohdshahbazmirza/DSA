class Solution {
    public int singleNumber(int[] nums) {
       /* HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i]))
                hmap.put(nums[i],2);
            else
                hmap.put(nums[i],1);
        }
        for(Integer in:hmap.keySet())
        {
            if(hmap.get(in)==1)
                return in;
        }
        return nums[0];*/
        
        int ans=0;
        for(int i=0;i<nums.length;i++)
            ans^=nums[i];
        return ans;
        
    }
}
