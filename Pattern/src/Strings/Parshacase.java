package Strings;

import java.util.Scanner;

public class Parshacase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Pasha's string");
		String a=s.next();
		System.out.println("Enter the number of days");
		int b=s.nextInt();
		System.out.println("Enter the position from which Pasha started transforming");
		int c=s.nextInt();
		char arr[]=a.toCharArray();
		int i;char ch;
		int l=a.length();
		int l2=c+l-1;
		String reverse = "";
		for(i=arr.length-2;i>0;i--)
        {
			System.out.print(arr[i]);
			System.out.printf("%c",arr[i]);
        }
		
	}

}
