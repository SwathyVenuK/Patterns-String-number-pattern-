package Numberpattern;

import java.util.Scanner;

public class patt6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i;int sum=4;
		int a=4;
		System.out.printf("%d ",a);
		for(i=1;i<n;i++)
		{
			sum=(i*i)+sum;
			System.out.printf("%d ",sum);
			
			
		}
		

	}

}
