public class Solution {
    public int solve(int[] ar) {
       int i;
     int n=ar.length;
     int min=2000,max=0;
     for(i=0;i<n;i++){
      if(ar[i]<min) min=ar[i];
      if(ar[i]>max) max=ar[i];
     }
    if(min==max) return 1; 
    boolean mn=false,mx=false;
    int l=0;
    int ans=n;
    for(i=0;i<n;i++){
      l+=1;    
      if(ar[i]==max && mx)  if(l<ans) ans=l;
         
      if(ar[i]==min && mn){
         if(l<ans) ans=l;  
      }
      if(ar[i]==min) {l=1; mx=true; mn=false;}
      else if(ar[i]==max){l=1; mn=true; mx=false;}
      else continue;    
        
    }
      return ans;    
      
      /*
        //Sol :2
      int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        int j=-1,k=-1;
        if(ar.length==1)
        return 1;
        for(int i=0;i<ar.length;i++)
        {
            min=Math.min(min,ar[i]);
            max=Math.max(max,ar[i]);
        }
        for(int i=0;i<ar.length;i++)
        {
            if(max==ar[i])
            {
                j=i;
            }
            if(ar[i]==min)
            {
                k=i;
            }
            if(k!=-1 && j!=-1)
            {
            ans=Math.min(ans,(Math.abs(k-j)+1));
            //System.out.println(k+" "+j+" "+ans);
            }
        }
        return ans;
      */  
    }
}
