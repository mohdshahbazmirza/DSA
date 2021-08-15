class Solution {
    public int heightChecker(int[] heights) {
        //int c_height=heights[0];
        int count=0;
        int arr[]=new int[heights.length];
        System.arraycopy(heights,0,arr,0,heights.length);
        Arrays.sort(arr);
        for(int i=0;i<heights.length;i++)
        {
            if(arr[i]!=heights[i])
                count++;
        }
        return count;
    }
}
