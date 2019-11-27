package Pattern;

import java.util.Scanner;

public class Pat7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;int j;int k=0;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
	 
		
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				
				 System.out.printf("%c " , k+65);
				 k++;
			}
			
			System.out.println();
		}
	
	

	}

}
