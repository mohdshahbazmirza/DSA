class Solution {
    public int bulbSwitch(int n) {
        int i=1;
        while(i<=n/i)
            i++;
        return i-1;
        
        //return (int)Math.sqrt(n);
    }
}