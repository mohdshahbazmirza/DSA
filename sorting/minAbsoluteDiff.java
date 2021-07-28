class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        int dif=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
            dif=Math.min(dif,arr[i]-arr[i-1]);
        
        for(int i=1;i<arr.length;i++)
        {
            if(dif==(arr[i]-arr[i-1]))
            {
                List<Integer> l=new ArrayList<>();
                l.add(arr[i-1]);
                l.add(arr[i]);
                list.add(l);
            }
        }
        return list;
    }
}
