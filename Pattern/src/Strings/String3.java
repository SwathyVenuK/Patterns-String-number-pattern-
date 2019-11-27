package Strings;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		int l=str.length();
		int i;int c1 = 0;int c2 = 0;int c3 = 0;int c4 = 0;int c5=0;int c6=0;
		for(i=0;i<l;i++)
		{
			char c=str.charAt(i);
			if(c>65&&c<=90)
			{
				c1++;			
			}
			
			 if(c>97&&c<=122)
			{
				c2++;
			}
				
			 if(c=='!'||c=='@'||c=='#'||c=='$'||c=='%'||c=='^'||c=='&'||c=='/'||c=='('||c=='*'||c==')')
			{
				c3++;
			}
			 if(c==' ')
			 {
				 c5++;
			 }
			 if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
			 {
				 c6++;
			 }
			 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				{
					c4++;
				}
			
		
			
		}
		 System.out.println("uppercase letters:"+c1);
		 System.out.println("lower case letters:"+c2);
			System.out.println("spcial characters:"+c3);
			System.out.println("spcial characters:"+c4);
			System.out.println("spaces:"+c5);
			System.out.println("numbers:"+c6);
			System.out.println("vowels:"+c4);
	
	}

}
