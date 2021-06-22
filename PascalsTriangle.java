class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        if(numRows==0)
            return triangle;
        
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        if(numRows==1)
        {
            return triangle;    
        }
        
        for(int i=1;i<numRows;i++)
        {
            List<Integer> nextRow=new ArrayList<>();
            List<Integer> prevRow=triangle.get(i-1);
            nextRow.add(1);
            for(int j=1;j<i;j++)
            {
                nextRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
            nextRow.add(1);
            triangle.add(nextRow);
        }
        return triangle;
        
        
    }
}