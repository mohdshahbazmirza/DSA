class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int top=0,left=0;
        int down=matrix.length-1;
        int right=matrix[0].length-1;
        
        int dir=0;
        int k=1;
        while(left<=right && top<=down)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    matrix[top][i]=k;
                    k++;
                }
                top++;
                dir=1;
            }
            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    matrix[i][right]=k;
                    k++;
                }
                    
                right--;
                dir=2;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    matrix[down][i]=k;
                    k++;
                }
                    
                down--;
                dir=3;
            }
            else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    matrix[i][left]=k;
                    k++;
                }
                    
                left++;
                dir=0;
            }
            
        }
        return matrix;
    }
}