package Pattern;

import java.util.Scanner;

public class Pattern111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in); 
System.out.println("Enter the number");
int n=s.nextInt();
int a=n;
int i;int j;
for(i=1;i<=n;i++)
{
	for(j=1;j<=n*2+1;j++)
	{
		
		if(i+j==7||j==i+5)
		{
			System.out.print("*");
		}
		else
		{
		System.out.print("#");
		}
	}
	System.out.println();
}

	}

}
