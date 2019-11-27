package Numberpattern;

import java.util.Scanner;

public class Patt4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i;
		float a=1;
		float b=2;
		float sum=0;
		System.out.printf("%.1f %.1f ",a,b);
		for(i=3;i<=n;i++)
		{
			if(i%2!=0)
			{
				sum=a*3;
				a=sum;
				System.out.printf("%.1f ",sum);
			}
			else
			{
				sum=b*3;
				b=sum;
				System.out.printf("%.1f ",sum);
			}
		}
	}

}
