class Solution {
    public int matrixScore(int[][] grid) {
        
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++)
        {
            if(grid[i][0]==0)
            {
                for(int j=0;j<col;j++)
                    if(grid[i][j]==0)
                        grid[i][j]=1;
                    else
                        grid[i][j]=0;
            }
        }
        for(int i=0;i<col;i++)
        {
            int count_1=0;
            int count_0=0;
            for(int j=0;j<row;j++)
            {
                if(grid[j][i]==0)
                    count_0++;
                else
                    count_1++;
            }
            if(count_0>count_1)
            {
                for(int j=0;j<row;j++)
                {
                    if(grid[j][i]==0)
                        grid[j][i]=1;
                    else
                        grid[j][i]=0;
                }
            }
        }
        int sum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum+=grid[i][j]*(1<<(col-j-1));
            }
        }
        return sum;
    }
}
