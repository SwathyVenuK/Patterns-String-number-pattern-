package Strings;

import java.util.Scanner;

public class string2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//even string reverse
		System.out.println("Enter the string");
		String string1=s.nextLine();
		String words[]=string1.split(" ");
		int i;int j;
		for(i=0;i<words.length;i++)
		{
			{
		
			if(i%2!=0)
			{ 
				int l=words[i].length();
			
				for(j=l-1;j>=0;j--)
				{
					System.out.print(words[i].charAt(j));
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(words[i]+" ");
			}
			}
			}
		}
	}
	


