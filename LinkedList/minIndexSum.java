class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hmap=new HashMap<>();
        //LinkedHashMap<Integer,String> lhmap=new LinkedHashMap<>();
        
        for(int i=0;i<list1.length;i++)
        {
            hmap.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        ArrayList<String> ar=new ArrayList<>();
        for(int i=0;i<list2.length;i++)
        {
            if(hmap.containsKey(list2[i]))
            {
               
                if(min>(i+hmap.get(list2[i])))
                {
                    ar.clear();
                    ar.add(list2[i]);
                }
                else if(min==(i+hmap.get(list2[i])))
                {
                    ar.add(list2[i]);
                }
                min=Math.min(min,i+hmap.get(list2[i]));
            }
        }
        String s[]=ar.toArray(new String[0]);
        return s;
    }
    //commit id=1b272bafbacd558120e7435d9813d75b6dea5407
}
