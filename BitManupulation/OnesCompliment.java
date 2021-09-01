class Solution {
    public int findComplement(int num) {
        
        int x=num,y=0;
        while(x!=0)
        {
            x=x>>1;
            y=y<<1;
            y=y+1;
            
        }
        return num^y;
    }
}
