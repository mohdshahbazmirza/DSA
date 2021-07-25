/*Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.

Problem Constraints
2 <= N <= 105
1 <= A[i] <= 109



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the maximum value of GCD.



Example Input
Input 1:

 A = [12, 15, 18]
Input 2:

 A = [5, 15, 30]


Example Output
Output 1:

 6
Output 2:

 15


Example Explanation
Explanation 1:

 
 If you delete 12, gcd will be 3.
 If you delete 15, gcd will be 6.
 If you delete 18, gcd will 3.
 Maximum vallue of gcd is 6.
Explanation 2:

 If you delete 5, gcd will be 15.
 If you delete 15, gcd will be 5.
 If you delete 30, gcd will be 5.*/

 public class Solution {
    public int solve(int[] ar) {
     
     int n=ar.length;
	 if(n==2) return Math.max(ar[0],ar[1]);
	 int[] prefixGCD=new int[n];  
	 int[] suffixGCD=new int[n];  
	 
	 prefixGCD[0]=ar[0];
	 suffixGCD[n-1]=ar[n-1];
	 int i;
	 for(i=1;i<n;i++) prefixGCD[i]=gcd(ar[i],prefixGCD[i-1]);
	 
	 for(i=n-2;i>=0;i--) suffixGCD[i]=gcd(ar[i],suffixGCD[i+1]);
	 int ans=gcd(prefixGCD[0],suffixGCD[2]);
	 for(i=2;i<n-1;i++)  ans=Math.max(ans,gcd(prefixGCD[i-1],suffixGCD[i+1]));
	 return ans;  
        
        
    }
     public int gcd(int a,int b) {
	  if(a==0) return b;
	  return gcd(b%a,a);
   }
}
