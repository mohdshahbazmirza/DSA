class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        
        for(int i=0;i<candies.length;i++)
        {
            int a=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++)
            {
                if(a<candies[j])
                {
                    a=candies[j];
                }
            }
            if(a==(candies[i]+extraCandies))
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}
