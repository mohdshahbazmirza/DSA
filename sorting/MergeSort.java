class Solution {
    public static void merge(int []arr,int start,int mid,int end)
    {
        int s=start;
        int e=end;
        int m=mid;
        int lenl1=m-s+1;
        int lenl2=e-m;
        int l1[]=new int[lenl1];
        int l2[]=new int[lenl2];
        for(int i=0;i<lenl1;++i)
            l1[i]=arr[s+i];
        for(int i=0;i<lenl2;++i)
            l2[i]=arr[m+i+1];
        int i=0,j=0,k=s;
        while(i<lenl1 && j<lenl2)
        {
            if(l1[i]<=l2[j])
            {
                arr[k]=l1[i];
                i++;
            }
            else
            {
                arr[k]=l2[j];
                j++;
            }
            k++;
        }
        while(i<lenl1)
        {
            arr[k]=l1[i];
            i++;
            k++;
        }
        while(j<lenl2)
        {
            arr[k]=l2[j];
            j++;
            k++;
        }
    }
    public static int[] sort(int[] arr,int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
        return arr;
    }
    public int[] sortArray(int[] nums) {
        int start=0;
        int end=nums.length-1;
        //int mid=(start+end)/2;
        return sort(nums,start,end);
        
    }
}