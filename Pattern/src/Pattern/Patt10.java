package Pattern;

import java.util.Scanner;

public class Patt10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;int j;
	System.out.println("Enter the string");
	String str=s.next();
	int l=str.length();
	char ch;
	for(i=0;i<l;i++)
	{
		for(j=0;j<=i;j++)
		{
			ch=str.charAt(j);
			System.out.printf("%c ",ch);
		}
		System.out.println();
	}
	}

}
