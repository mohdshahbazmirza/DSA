class Solution {
    public int[] decode(int[] encoded, int first) {
        int l=encoded.length;
        int ans[]=new int[l+1];
        ans[0]=first;
        for(int i=0;i<l;i++)
        {
            ans[i+1]=ans[i]^encoded[i];
        }
        return ans;
    }
}
