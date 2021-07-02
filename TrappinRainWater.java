class Solution {
    public int trap(int[] height) {
        int l=height.length;
        int rmax[]=new int[l];
        int lmax[]=new int[l];
        int m=Integer.MIN_VALUE;
        int n=Integer.MIN_VALUE;
        for(int i=0;i<l;i++)
        {
            if(m<height[i])
            {
                m=height[i];
            }
            lmax[i]=m;
        }
        for(int i=l-1;i>=0;i--)
        {
            if(n<height[i])
            {
                n=height[i];
            }
            rmax[i]=n;
        }
        int ans=0;
        for(int i=0;i<l;i++)
        {
            ans+=Math.min(lmax[i],rmax[i])-height[i];
        }
        return ans;
    }
}