package Strings;

import java.util.Scanner;

public class String12 {

	public static void main(String[] args)
	{
		 Scanner s=new Scanner(System.in);
		 int i;
		  int max=0;
		  int mm=0;
		  String a=s.nextLine();
		  int b=a.length();
		  String[] words=a.split(" ");
		 
		  for(i=0;i<words.length;i++)
		  {
			   mm=words[i].length();
			  if(mm>max)
			  {
				  max=mm;
			  }
			
		   }
		
		  for(i=0;i<words.length;i++)
	
		if(max==words[i].length())
		{
			 System.out.println("longest word is:"+words[i]);
		}
	
	  System.out.println("length of longest word is:"+max);
	}
	}


