class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            int c=0;
            for(int j=1;j*j<=nums[i];j++)
            {
                if(nums[i]%j==0 && j!=nums[i]/j)
                {
                    sum+=j+nums[i]/j;
                    c+=2;
                }      
                else if(nums[i]%j==0 && j==nums[i]/j)
                {
                    sum+=j;
                    c+=1;
                }       
            }  
            if(c==4)
                ans+=sum;
        }
        return ans;
    }
}
/*
TreeSet<String> ts=new TreeSet<>();
for(int i=0;i<sub_count;i++)
{
    ts.add(arr[i]);
}
int count=0;
for(String s:ts)
{
    count++;
    if(s.equals(X))
        return count;
}*/