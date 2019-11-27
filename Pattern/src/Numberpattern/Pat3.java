package Numberpattern;

import java.util.Scanner;

public class Pat3 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i;float a=1;
		float b=1;
		float c=1;
		
		for(i=1;i<n;i++)
		{
			
			System.out.printf("%.1f ",c);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
