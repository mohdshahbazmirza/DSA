class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int p1=0;
        int p2=numbers.length-1;
        while(p1<p2)
        {
            int n=numbers[p1]+numbers[p2];
            if(n==target)
            {
                ans[0]=p1+1;
                ans[1]=p2+1;
                break;
            }
            else if(n<target)
                p1++;
            else
                p2--;
        }
        return ans;   
    }
}