package Pattern;

import java.util.Scanner;

public class Patern13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;int j;int sum;int sc;int k;int sum1;int p;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
			
				System.out.print(j+1);
 	}
			System.out.print(" ");
			for(p=n-1;p>i;p--)
			{
			
				System.out.print(" ");
			}
			for(k=i;k>=0;k--)
			{
			
				System.out.print(k+1);
			}
			System.out.println();
		}
		
		}
	

}
