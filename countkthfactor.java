class Solution {
    public int kthFactor(int n, int k) {
        int count=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                ar.add(i);
                if(n/i!=i)
                ar.add(n/i);
            }
        }
        Collections.sort(ar);
        for(int i=0;i<ar.size();i++)
        {
            count++;
            if(count==k)
                return ar.get(i);
            
        }
        return -1;
    }
}