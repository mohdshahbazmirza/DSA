class Solution {
    public static boolean arr[];
        public static TreeSet<Integer> prime; 
        public static void primesieve(int n)
        {
            arr=new boolean[n+1];
            prime=new TreeSet<>();
            Arrays.fill(arr,true);
            for(int i=2;i*i<=n;i++)
                if(arr[i])
                {
                    for(int j=i*i;j<=n;j+=i)
                        arr[j]=false;
                }
            for(int i=2;i<=n;i++)
                if(arr[i])
                    prime.add(i);
        }
    public int numPrimeArrangements(int n) {
        
        primesieve(n);
        int a=prime.size();
        int b=n-a;
        long fact=1;
        long mod=1000000007;
        //System.out.println(a+" "+b);
        for(int i=2;i<=a;i++)
        {
            fact=(fact*i)%mod;
        }
        long fact2=1;
        for(int i=2;i<=b;i++)
            fact2=(fact2*i)%mod;
        
        return (int)((fact*fact2)%mod);
    }
}