package Pattern;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;int j;
		System.out.println("Enter a number");
		
		int n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==j)
				{
					System.out.printf("0");
				}
				else
				{
				System.out.printf("%d",i);
			}
			}
			System.out.println();
		
	}

}
}