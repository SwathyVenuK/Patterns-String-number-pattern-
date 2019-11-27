package Numberpattern;

import java.util.Scanner;

public class Pat1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int a=0;int i;int sum=0;
	
		for(i=1;i<n;i++)
		{
			if(i%2==0)
			{
				sum=(i*i)-2;
			}
			else
			{
				sum=(i*i)-1;
			}
			System.out.printf("%d ",sum);
		}
		

	}

}
