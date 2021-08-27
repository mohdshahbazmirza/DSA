class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0, res1 = 0, res2 = 0;
        for (int i : nums) xor ^= i;

        int sn = xor & ~(xor - 1);

        for (int i = 0; i < nums.length; i++)
            if ((nums[i] & sn) != 0) res1 ^= nums[i];
            else res2 ^= nums[i];
        
        return new int[]{res1, res2};
    }
}
