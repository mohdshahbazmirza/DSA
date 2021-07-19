class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int end=matrix.length-1;
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(matrix[mid][0]==target)
            {
                return true;
            }
            else if(matrix[mid][0]<target)
            {
                start=mid+1;
            }
            else if(matrix[mid][0]>target)
            {
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        if(start==0)
            return false;
        start=start-1;
        int s=0;
        int e=matrix[0].length-1;
        int m=(s+e)/2;
        while(s<=e)
        {
            if(matrix[start][m]==target)
            {
                return true;
            }
            else if(matrix[start][m]<target)
            {
                s=m+1;
            }
            else if(matrix[start][m]>target)
            {
                e=m-1;
            }
            m=(s+e)/2;
        }
        return false;
    }
}