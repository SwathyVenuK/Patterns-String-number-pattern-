package Pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;int j;int sum;int sc;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j||(i+j)==n-1)
				{
					System.out.print("* ");
				}
				
				else
					
				{
				System.out.print("0 ");
				}
			}
			
			System.out.println();
			}
	}

	
}
