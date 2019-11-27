package Pattern;

import java.util.Scanner;

public class Pat8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;int j;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
	 
		
		for(i=n;i>0;i--)
		{
			for(j=i;j<=0;j--)
			{
				
				 System.out.printf("%c " , j+65);
				 
			}
			
			System.out.println();
		}

	}

}
