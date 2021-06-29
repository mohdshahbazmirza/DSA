
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int max=Integer.MIN_VALUE,c_sum=0;
        for(int i=0;i<K;i++)
        {
            c_sum+=Arr.get(i);
        }
        max=c_sum;
        for(int i=K;i<N;i++)
        {
            c_sum=c_sum+Arr.get(i)-Arr.get(i-K);
            max=Math.max(max,c_sum);
        }
        return max;
    }
}