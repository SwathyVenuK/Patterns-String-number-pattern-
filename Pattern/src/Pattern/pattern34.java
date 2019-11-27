package Pattern;

import java.util.Scanner;

public class pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i;int j;
		int k = 0;int p;
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
			for(j=0;j<=n;j++)
			{
				System.out.print("C");
			}
			System.out.println();
			}
			else
			{
				for(k=0;k<=n-1;k++)
				{
				if((i+k)%2!=0)
				{
				System.out.print("*");
			
				}
			
				else
				{
					System.out.print("S");
				
				}
				
				}

			System.out.println();
			}
			if(i==n-1)
			{
				for(p=0;p<=n;p++)
				{
					System.out.print("K");
				}
				System.out.println();
				
			}
	}

	}
}


