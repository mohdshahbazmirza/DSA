class Solution {
    public String intToRoman(int num) {
        LinkedHashMap<Integer,String> hmap=new LinkedHashMap<>();
        hmap.put(1000,"M");
        hmap.put(900,"CM");
        hmap.put(500,"D");
        hmap.put(400,"CD");
        hmap.put(100,"C");
        hmap.put(90,"XC");
        hmap.put(50,"L");
        hmap.put(40,"XL");
        hmap.put(10,"X");
        hmap.put(9,"IX");
        hmap.put(5,"V");
        hmap.put(4,"IV");
        hmap.put(1,"I");
        StringBuilder sb=new StringBuilder();
        for(Integer key:hmap.keySet())
        {
            while(num-key>=0){
                sb.append(hmap.get(key));
                num=num-key;
            }
        }
        
        return sb.toString();
        
    }
}