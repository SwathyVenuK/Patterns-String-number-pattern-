package Numberpattern;

import java.util.Scanner;

public class pat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=11;int i;int sum=0;
	
		for(i=1;i<n;i++)
		{
			sum=a*a;
			System.out.printf("%d ",sum);
			a=a+4;
		}
	}

}
