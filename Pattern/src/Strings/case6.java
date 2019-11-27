package Strings;

import java.util.Scanner;

public class case6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String str1=s.next();
		System.out.println("Enter the 12nd string");
		String str2=s.next();
		System.out.println("Enter the 3rd string");
		String res=s.next();
		char ch[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		char ch3[]=res.toCharArray();
		int i;
	
		for(i=0;i<ch.length;i++)
		{
			char c1=str1.charAt(i);
		if(c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U'||c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
		{
             ch[i]='$';
		}
		
	}
		for(i=0;i<ch.length;i++)
		{
			System.out.printf("%c",ch[i]);
		}
		
		for(i=0;i<ch2.length;i++)
		{
			char c2=str2.charAt(i);
		if(c2!='A'&&c2!='E'&&c2!='I'&&c2!='O'&&c2!='U'&&c2!='a'&&c2!='e'&&c2!='i'&&c2!='o'&&c2!='u')
		{
             ch2[i]='#';
		}
	}
		for(i=0;i<ch.length;i++)
		{
			System.out.printf("%c",ch2[i]);
		}
		
			//char cr=res.charAt(i);
		String cf=res.toUpperCase();
		System.out.println(cf);
	
	}
	

}
