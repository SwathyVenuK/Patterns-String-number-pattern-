package Strings;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//all functions in string
		System.out.println("Enter a 1st string");
		String string1=s.nextLine();
		System.out.println("\nEnter a 2nd string");
		String string2=s.nextLine();
		System.out.println("\nEnter a 3rd string");
		String string3=s.nextLine();
		int l=string1.length();
		System.out.println(l);
		char c=string1.charAt(4);
		System.out.println("character at 4 is:"+c);
		String d=string1.substring(2,5);
		System.out.println(d);
		int index=string1.indexOf("is");
		System.out.println("index is "+index); 
		String replace=string2.replace("t","T");
		System.out.println("replace t with T ="+replace); 
		
		String concat=string1.concat(string2);
		System.out.println("string1+string2="+concat);
		boolean start=string2.startsWith("the");
		System.out.println("true/flalse="+start);
		if(string1.equals(string2))
		{
			System.out.println("yes");

		}
		else
		{
			System.out.println("no");
		}
		int i;
		String words[]=string1.split(" ");
		for(i=0;i<=words.length;i++)
		{
			System.out.println(words[i]);
		}

	
	}

}
