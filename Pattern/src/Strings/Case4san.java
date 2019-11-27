package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Case4san {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the guest's name");
		String s1=s.next();
		System.out.println("Enter the The second string contains the name of the residence host");
		String s2=s.next();
		System.out.println("Enter the The third string contains letters in a pile that were found at the door in the morning");
		String s3=s.next();
		String tot=s1.concat(s2);
		char arr[]=tot.toCharArray();
		char result[]=s3.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(result);
		int f=0;
		int i;
		String a=new String(arr);
		String b=new String(result);
		
		if(a.contentEquals(b))
		{
	
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}
