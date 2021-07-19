class Solution {
    public void setZeroes(int[][] matrix) {
         TreeSet<Integer> ts1=new TreeSet<Integer>();
         TreeSet<Integer> ts2=new TreeSet<Integer>();
         int row=matrix.length;
         int col=matrix[0].length;
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    ts1.add(i);
                    ts2.add(j);
                }
            }
        }
        for(Integer val:ts1)
        {
            for(int j=0;j<col;j++)
            {
                matrix[val][j]=0;
            }
        }
        for(Integer val:ts2)
        {
            for(int j=0;j<row;j++)
            {
                matrix[j][val]=0;
            }
        }
    }
}