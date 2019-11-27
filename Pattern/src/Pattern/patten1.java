package Pattern;

import java.util.Scanner;

public class patten1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;int j;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.printf("*");
			}
			
			System.out.println();
		}

	}

}
