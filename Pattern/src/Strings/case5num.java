package Strings;

import java.util.Scanner;

public class case5num {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the length");
	int n=s.nextInt();
	int i;
	int a=0;int b=0;int c=2;int f=0;int d=1;
//	System.out.printf("%d %d ",a,b);
	for(i=2;i<n;i++)
	{
		if(i%2==0)
		{
			a=a+c;
			f=1;
		//	System.out.printf("%d ",a);
		}
		else
		{
			b=b+d;
			f=0;
		//	System.out.printf("%d ",b);
		}
	}
	
	if(f==1)
	{
		System.out.printf("%d ",a);
	}
	else
	{
		System.out.printf("%d ",b);
	}
	}
}
