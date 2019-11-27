package Pattern;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;int j;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
	      int alphabet = 65;
		
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print((char) alphabet + " ");
				//or System.out.printf(%c + i+65);
			}
			alphabet++;
			System.out.println();
		}
	}

}
