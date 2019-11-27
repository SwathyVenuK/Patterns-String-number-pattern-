package Pattern;

import java.util.Scanner;

public class Assmatrix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("rows");
		int n=s.nextInt();
		System.out.println("coulmns");
		int m=s.nextInt();
		int c1=0;int c2=0;
		int a[][]=new int[n][m];
		System.out.println("enter the elements");
		int i;int j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
			a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(a[i][j]==1)
				{
					c1++;
				}
				if(a[i][j]==0)
				{
					c2++;
				}
			}
	}
if(c1>c2)
{
	System.out.println("Most of the elements are '1' in the matrix");
}
else
{
	System.out.println("Most of the elements are '0' in the matrix");
}
}
}
