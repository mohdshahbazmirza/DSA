public class Solution {
    public int[] solve(int n, int[][] ar) {
        
        int ans[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            ans[ar[i][0]-1]+=ar[i][2];
            if(ar[i][1]!=n)
            ans[ar[i][1]]-=ar[i][2];
        }
        for(int i=1;i<n;i++)
        {
            ans[i]+=ans[i-1];
        }
        return ans;
    
        /*int i;
        int ans[]=new int [n];
        
       for(i=0;i<ar.length;i++){
         
         int start=ar[i][0];
         int end=ar[i][1];
         int element=ar[i][2];
         
         ans[start-1]=ans[start-1]+element;
         
         if(end < n) ans[end]=ans[end]-element;
         
        
       }
    
    for(i=1;i<n;i++) ans[i]=ans[i]+ans[i-1];
    
    return ans;    
        */
        
        
        
    }
}
