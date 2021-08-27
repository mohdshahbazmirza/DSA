class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int n=(int)Math.pow(2,nums.length);
        for(int i=0;i<n;i++)
        {
            int j=0;
            int k=i;
            ArrayList<Integer> l=new ArrayList<>();
            while(k!=0)
            {
                if((k&1)==1)
                    l.add(nums[j]);
                j++;
                k=k>>1;
            }
            if(!list.contains(l))
            list.add(l);
        }
        return list;
    }
}
