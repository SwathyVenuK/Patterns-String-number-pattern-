package Pattern;

import java.util.Scanner;

public class pat6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;int j;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
	 
		
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				
				 System.out.printf("%c " , j+65);
			}
			
			System.out.println();
		}
	}
	}


