class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        
        for(int i=0;i<row;i++)
        {
            for(int j=i;j<col;j++)
            {
                matrix[i][j]+=matrix[j][i]-(matrix[j][i]=matrix[i][j]);
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col/2;j++)
            {
               matrix[i][j]+=matrix[i][col-j-1]-(matrix[i][col-j-1]=matrix[i][j]); 
            }
        }
    
    }
}