package Pattern;

import java.util.Scanner;

public class Pa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;int j;int k;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		
		for(i=n-1;i>=0;i--)
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


