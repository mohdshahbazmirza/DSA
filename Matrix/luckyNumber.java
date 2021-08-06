class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int index=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(min>matrix[i][j])
                {
                    index=j;
                    min=matrix[i][j];
                }
            }
            for(int k=0;k<row;k++)
            {
                max=Math.max(max,matrix[k][index]);
            }
            if(min==max)
                list.add(min);
              min=Integer.MAX_VALUE;
              max=Integer.MIN_VALUE;
        
        }
        return list;
    }
}