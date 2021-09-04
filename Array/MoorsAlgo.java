class Solution {
    public int majorityElement(int[] nums) {
        
        /*HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i]))
                hmap.put(nums[i],hmap.get(nums[i])+1);
            else
                hmap.put(nums[i],1);
        }
        for(Integer i:hmap.keySet())
            if(hmap.get(i)>(nums.length/2))
                return i;
        
        return 0;*/
        int count=0;
        int element=0;
        for(int i:nums)
        {
            if(count==0)
                element=i;
            if(element==i)
                count++;
            else
                count--;
        }
        return element;
    }
}
