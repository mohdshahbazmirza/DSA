class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int ans[][]=new int[row][row];
        for(int i=0;i<row;i++)
        {
            for(int j=row-1;j>=0;j--)
            {
                if(image[i][j]==1)
                    ans[i][row-j-1]=0;
                else
                    ans[i][row-j-1]=1;
            }
        }
        return ans;
    }
}
