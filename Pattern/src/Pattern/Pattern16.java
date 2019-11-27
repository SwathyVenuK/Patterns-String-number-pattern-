package Pattern;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;int j;int k;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(k=n;k>=i;k--)
			{
			
				System.out.print(" ");
			}
		
			for(j=i;j>=0;j--)
			{
			
				System.out.printf("%d ",j+1);
			
				
			}
			System.out.println();

	}

}
}
