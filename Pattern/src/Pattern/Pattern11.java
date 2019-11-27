package Pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;int j;int k;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				
					System.out.print("*");
					
			}
			System.out.print(" ");
			for(k=0;k<=i;k++)
			{
				
					System.out.printf("*");
				
				
			}
			
			System.out.println();
			
					
		}

	}

	}


