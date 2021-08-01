class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            hmap.put(nums1[i],1);
        }
        HashSet<Integer> ar=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(hmap.containsKey(nums2[i]))
            {
                ar.add(nums2[i]);
            }
        }
        int a[]=new int[ar.size()];
        int j=0;
        for(Integer i:ar)
        {
            a[j]=i;
            j++;
        }
        return a;
    }
}