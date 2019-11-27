package Numberpattern;

import java.util.Scanner;

public class Patt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i;int c;
		double a=0.5;
	
		double sum=0;
		System.out.printf("%.1f ",a);
		for(i=0;i<n;i++)
		{
			sum=a*3;
			System.out.printf("%.1f ",sum);
			a=sum;
		}
	}

}
