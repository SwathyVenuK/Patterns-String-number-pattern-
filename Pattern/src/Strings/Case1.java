package Strings;

import java.util.Scanner;

public class Case1 {

	public static void main(String[] args, Object name1) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st name");
		String str1=s.nextLine();
		System.out.println("Enter the 2nd name");
		String str2=s.nextLine();
		String n1=str1.toLowerCase();
		String n2=str2.toLowerCase();
		int l1=n1.length();
		int l2=n2.length();
		int i;int j;
		for(i=0;i<l1;i++)
		{
		char name11=n1.charAt(i);
		for(j=0;i<l2;j++)
		{
			char name2=n2.charAt(j);
		
		if(name11==name2)
		{
			char f1=name11.replace(i,i+1,'0');
			char f2=name12.replace(j,j+1,'0');
			
		}
	}

		}
		}
	}
