class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(hmap.containsKey(temp)&&hmap.get(temp)!=i){
                return new int[]{hmap.get(temp),i};
            }
        }
        throw new IllegalArgumentException("No target found");
    }
}