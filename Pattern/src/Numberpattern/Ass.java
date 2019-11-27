package Numberpattern;

import java.util.Scanner;

public class Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int[n];
int i;int j;int max=0;int min=10000;int sum=0;
for(i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
}
for(i=0;i<n;i++)
{
	if(a[i]<min)
	{
		min=a[i];
	}
}
for(i=0;i<n;i++)
{
	sum=sum+a[i];
}
System.out.println("largest"+max);
System.out.println("min"+min);
System.out.println("sum"+sum);

	}

}
