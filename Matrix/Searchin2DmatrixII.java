class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        int row=matrix.length-1;
        
        while(i!=row || j!=0)
        {
            if(j>=0 && matrix[i][j]>target)
            {
                if(j==0)
                    return false;
                j--;
            }
            else if(i<=row && matrix[i][j]<target)
            {
                if(i==row)
                    return false;
                i++;
            }
            else if(matrix[i][j]==target)
                return true;
            
        }
        if(matrix[i][j]==target)
            return true;
        return false;
    }
}