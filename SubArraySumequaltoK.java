class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hmap=new HashMap();
        int count=0;
        int csum=0;
        for(int i=0;i<nums.length;i++)
        {
            csum+=nums[i];
            if(csum==k)
                count++;
            if(hmap.containsKey(csum-k) )
                count+=hmap.get(csum-k);
            hmap.put(csum,hmap.getOrDefault(csum,0)+1);
        }
        return count;
        
    }
}