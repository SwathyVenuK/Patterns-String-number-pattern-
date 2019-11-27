package Pattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;int j;int k;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		
		for(i=0;i<=n;i++)
		{
			for(j=n-i;j>1;j--)
			{
				System.out.printf(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.printf("* ");
			}
			
			System.out.println();
		
	}}

}
