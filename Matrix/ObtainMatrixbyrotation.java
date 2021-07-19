class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int row=mat.length;
        for(int k=1;k<=4;k++)
        {
            int count=0;
        for(int i=0;i<row;i++)
            for(int j=i;j<row;j++)
                mat[i][j]+=mat[j][i]-(mat[j][i]=mat[i][j]);
        for(int i=0;i<row;i++)
            for(int j=0;j<row/2;j++)
               mat[i][j]+=mat[i][row-j-1]-(mat[i][row-j-1]=mat[i][j]); 
        for(int i=0;i<row;i++)
            for(int j=0;j<row;j++)
                if(mat[i][j]==target[i][j])
                    count++;
            if(count==row*row)
                return true;
        }
    return false;
    }
}