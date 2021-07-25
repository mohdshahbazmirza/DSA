/*Little Ponny and GCD LCM
Problem Description

Little Ponny's mathematic's teacher gives him some homework:

Given A = GCD(X, Y) and B = LCM(X, Y), find X and Y.

Little Ponny has a lot of trouble finding X and Y, so he asks for your help. Can you help him?

NOTE:

If there are multiple possible answers, then minimize X.
If there is no possible answer, then return [-1, -1]


Problem Constraints
1 <= A <= B <= 109



Input Format
The first argument of input contains an integer, A.

The second argument of input contains an integer, B.



Output Format
Return an array of 2 integers, representing X and Y, respectively.



Example Input
Input 1:

 A = 5
 B = 10 
Input 2:

 A = 5
 B = 7 


Example Output
Output 1:

 [5, 10] 
Output 2:

 [-1, -1] 


Example Explanation
Explanation 1:

 If X = 5 and Y = 10, then GCD(X, Y) = 5 and LCM(X, Y) = 10. 
Explanation 2:

 There is no possible answer in this case. */

 public class Solution {
    public int[] solve(int a, int b) {
        
        if(b%a==0)
            return new int[]{a,b};
        else
            return new int[]{-1,-1};
        
    }
    
    /*public int[] solve(int a, int b) {
        
      if(a==gcd(a,b)) return new int[]{a,b};
      else return new int[]{-1,-1};
        
    }
  public int gcd(int a,int b){
      if(a==0) return b;
      return gcd(b%a,a);
  }*/
}
