int gap=(n+m+1)/2;
    int i=0;
    int j=gap;
    while(gap!=0)
    {
        while(j<m+n)
        {
            if(j<n && arr1[i]>arr1[j])
            {
                int temp=arr1[i];
                arr1[i]=arr1[j];
                arr1[j]=temp;
                //System.out.println(arr1[i]+" " +arr1[j]);
            }
            else if(i<n && j>=n && arr1[i]>arr2[j])
            {
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                //System.out.println(arr1[i]+" " +arr2[j]);
            }
            else if(arr2[i]>arr2[j])
            {
                int temp=arr2[i];
                arr2[i]=arr2[j];
                arr2[j]=temp;
                //System.out.println(arr2[i]+" " +arr2[j]);
                //arr2[i%n]=arr2[i%n]+arr2[j%n]-(arr2[j%n]=arr2[i%n]);
            }
            i++;
            j++;
        }
        if(gap!=1)
        gap=gap/2;
        else
        gap=0;
        
        i=0;
        j=gap;
    }
    
    //code here
    /*int i=n-1;
    int j=m-1;
    int temp=0;
    while(i>=0 && j>=0)
    {
        if(arr1[i]>=arr2[j])
        {
            arr1[i]=arr1[i]+arr2[j]-(arr2[j]=arr1[i]);
        }
        temp=arr1[i];
        while(i!=0 && temp<arr1[i-1])
        {
            arr1[i]=arr1[i-1];
            i--;
        }
        arr1[i]=temp;
        j=j-1;
        i=n-1;
    }*/