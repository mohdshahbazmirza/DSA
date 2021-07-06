\class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> list=new ArrayList<>();
        int top=0,left=0;
        int down=matrix.length-1;
        int right=matrix[0].length-1;
        
        int dir=0;
        while(left<=right && top<=down)
        {
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                    list.add(matrix[top][i]);
                top++;
                dir=1;
            }
            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                    list.add(matrix[i][right]);
                right--;
                dir=2;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                    list.add(matrix[down][i]);
                down--;
                dir=3;
            }
            else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                    list.add(matrix[i][left]);
                left++;
                dir=0;
            }
        }
        return list;
    }
}