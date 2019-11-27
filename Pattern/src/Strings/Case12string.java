package Strings;

import java.io.BufferedReader;
import java.util.Scanner;

import java.io.IOException;
import java.io.InputStreamReader;

public class Case12string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		int i = 1;
		String x;
		String z;
		do {
		System.out.println("registeration");
		System.out.println("Enter your first name");
		s.append(" Name:"+sc.next()+"\n");
		System.out.println("Enter your contact number");
		s.append("contact number:"+sc.next()+"\n");
		System.out.println("Enter the email");
		s.append("email"+sc.next()+"\n");
		System.out.println("Enter the poof type");
		s.append("ptype:"+sc.next()+"\n");
		System.out.println("Enter the poof id");
		s.append("pid"+sc.next()+"\n");
		System.out.println("\nThank you for registering.your id is"+i);
		System.out.println("\nDo you want to continue registration (y/n)?");
		x=sc.next();
		i++;
		}while(x.equals("y"));
		System.out.println("Do you want to update email(y/n)");
		z=sc.next();
		if(z.equals("y"))
{
			System.out.println("Enter the new email");
			s.append("email:"+sc.next()+"\n");
			System.out.println("\nemail updated");
			System.out.println("\nYour details as follows");
			System.out.println(s);
}
		else
		{
			System.out.println("\nYour details as follows");
			System.out.println(s);
		}
	}

}
