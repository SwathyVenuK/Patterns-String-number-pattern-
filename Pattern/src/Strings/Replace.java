package Strings;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("Enter the name");
		s.append("Name:"+sc.next()+"\n");
		System.out.println("Enter the id");
		s.append("id:"+sc.next());
		s.insert(10, " fore");
		s.delete(13,14);
		s.replace(5, 8, "welcome");
		s.deleteCharAt(8);
System.out.println(s);
	}

}
