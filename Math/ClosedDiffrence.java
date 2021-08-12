/* Closed Differences
Problem Description

You are given an integer array A of size N.

Consider any pair i , j, if the difference | A[i] - A[j] | doesn't belongs to A then append the difference value to the array.
Keep on adding the elements untill no new elements can be formed.
Find the size of the final array.

Note: Initially no two elements are equal.



Problem Constraints
1 <= N <= 100000
1 <= A[i] <= 1e9


Input Format
Input contains an integer array A



Output Format
Return an integer denoting the size of the final array.



Example Input
Input 1:

 A = [0, 3, 4]
Input 2:

 A = [2, 4, 6, 7]


Example Output
Output 1:

 5
Output 2:

 7


Example Explanation
Explanation 1:

 Initially, array A = [0, 3, 4].
 Consider two elements 4 , 3 and their difference |4 - 3| = 1. 
 1 is not present in the array. Now, the array becomes [0, 3, 4, 1].

 Take another pair 1 , 3 and their difference |1 - 3| = 2.
 2 is added to the array.

 Now, no pair exists which gives us a new element.

 Final array is [0, 3, 4, 1, 2].

 So, our answer is 5.
*/
public class Solution {
    public int gcd(int a, int b)
    {
        if(a==0) return b;
        else return gcd(b%a,a);
        
    }
    public int solve(int[] A) {
    int g=A[0];
    int max=A[0];
    int count=0;
    if(g==0)
     count++;
    for(int i=1;i<A.length;i++)
    {
        if(A[i]==0)
            count++;
        g=gcd(g,A[i]);
        max=Math.max(max,A[i]);
    }
    if(A.length==1 && A[0]==0)
        return 1;
    if(count!=0)
    return (max/g)+1;
    else
    return max/g;
    }
}