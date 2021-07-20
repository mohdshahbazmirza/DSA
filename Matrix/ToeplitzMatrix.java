class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        
        for(int i=1;i<R;i++)
        {
            for(int j=1;j<C;j++)
            {
                if(matrix[i][j]!=matrix[i-1][j-1])
                    return false;
            }
        }
        return true;
    }
}