class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]*=nums[i];
        }
        int left=0;
        int right=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[left]<nums[right])
            {
                ans[i]=nums[right];
                right--;
            }
            else
            {
                ans[i]=nums[left];
                left++;
            }
        }
        return ans;
        /*int p1=0;
        int p2=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                p2=i;
                break;
            }
        }
        p1=p2-1;
        if(p2==-1)
            p1=nums.length-1;
       // System.out.println(p1+" "+p2);
        int i=0;
        int ans[]=new int[nums.length];
        while(p1>=0&&p1<nums.length || p2<nums.length&&p2!=-1)
        {
            if(p1==-1)
            {
                ans[i]=nums[p2]*nums[p2];
                p2++;
            }
            else if(p2==-1)
            {
                ans[i]=nums[p1]*nums[p1];
                p1--;
            }
            else if(p1<nums.length && p2<nums.length && nums[p2]<=Math.abs(nums[p1]))
            {
                ans[i]=nums[p2]*nums[p2];
                p2++;
            }
            else
            {
                ans[i]=nums[p1]*nums[p1];
                p1--;
            }
            i++;
        }
        //Arrays.sort(ans);
        return ans; */
    }
}
