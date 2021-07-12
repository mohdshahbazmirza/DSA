public class MyClass {
    public static void PRS(String s,int i,int j)
    {
        
        if(j<i)
        return;
        System.out.print(s.charAt(j--));
        PRS(s,i,j);
    }
    public static void main(String args[]) {
      PRS("cool",0,3);
    }
}