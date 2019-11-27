package Pattern;

import java.util.Scanner;

public class pat231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the number");
		int n=s.nextInt();
		int i;int j;int k;int p;
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("C");
			}
			for(k=0;k<i;k++)
			{
				System.out.print("S");
			}
			for(p=0;p<i;p++)
			{
				System.out.print("K");
			}
			System.out.println();
		}

	}

}
