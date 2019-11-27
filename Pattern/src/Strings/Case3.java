package Strings;

import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1="qwertyuiop[asdfghjkl;zxcvbnm,";
		System.out.println("Enter the character(R/L)");
		char c=s.next().charAt(0);
		System.out.println("Enter the string");
		String str2=s.next();
		int i;int j;
for(i=0;i<str2.length();i++)
{
	
	for(j=0;j<str1.length();j++)
	{
	//	char ch1=str1.charAt(i);
		//char ch2=str1.charAt(j);
		if(str2.charAt(i)==str1.charAt(j)&&c=='R')
		{
			System.out.printf("%c",str1.charAt(j-1));
		}
		else if(str2.charAt(i)==str1.charAt(j)&&c=='L')
		{
			System.out.printf("%c",str1.charAt(j+1));
		}
	}
	
}
	}

}
