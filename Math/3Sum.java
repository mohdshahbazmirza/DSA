class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list =new ArrayList<>();
        if(nums.length<3)
        {
            return list;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int low=i+1;
            int high=nums.length-1;
            while(low<high)
            {
                if((nums[low]+nums[high])==-nums[i])
                {
                    List<Integer> list1=new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[low]);
                    list1.add(nums[high]);
                    if(!list.contains(list1))
                        list.add(list1);
                        //list.add(nums[i],nums[low],nums[high]);
                }
                if((nums[low]+nums[high])<-nums[i])
                    low++;
                else
                    high--;
            }
        }
        return list;
    }
}