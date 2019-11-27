package Pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;int j;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		
		for(i=0;i<=n;i++)
		{
			for(j=n;j>i;j--)
			{
				System.out.printf("*");
			}
			
			System.out.println();
		}

	}

}
