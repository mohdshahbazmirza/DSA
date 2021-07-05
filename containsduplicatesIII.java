class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            Long floor=set.floor((long)nums[i]);
            //System.out.print(floor+ " ");
            if(floor!=null && nums[i]-floor<=t)
                return true;
            Long ciel=set.ceiling((long)nums[i]);
            //System.out.print(ciel+" ");
            if(ciel!=null && ciel-nums[i]<=t)
                return true;
            set.add((long)nums[i]);
            //System.out.println(set);
            if(set.size()>k)
                set.remove((long)nums[i-k]);
            
        }
        return false;
    }
}