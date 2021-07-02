import java.util.Scanner;
class pattern
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++){
			k=i+1;
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1)
				{
					arr[i][j]=k;
					k--;
				}
				else
				{
					arr[i][j]=0;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}