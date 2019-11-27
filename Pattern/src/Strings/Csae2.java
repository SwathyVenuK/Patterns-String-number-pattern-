package Strings;

import java.util.Scanner;
import java.io.BufferedReader;
import java.util.Scanner;

import java.io.IOException;
import java.io.InputStreamReader;

public class Csae2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		Car obj1=new Car();
		Bike obj2=new Bike();
		String x;
		String z;
		String k;
		System.out.println("Enter the option:1)car2)bike");
		x=sc.next();
		if(x.contentEquals("1"))
		{
			System.out.println("Enter the Details of car");
			System.out.println("Enter the colour");
			s.append(" coulor:"+sc.next()+"\n");
			System.out.println("Enter the maximum speed");
			s.append(" speed:"+sc.next()+"\n");
			System.out.println("Enter the number of seats");
			s.append(" coulor:"+sc.next()+"\n");
			System.out.println("Enter the number of wheels");
			s.append(" wheels:"+sc.next()+"\n");
			System.out.println("Enter the maximum doors ");
			s.append("doors:"+sc.next()+"\n");
			System.out.println("Enter the status of AC(true/false )");
			//z=sc.next();
		
			s.append("Ac:"+sc.next());
			obj1.display(s);
			}
			else if(x.contentEquals("2"))
			{
				System.out.println("Enter the Details of bike");
				System.out.println("Enter the colour");
				s.append(" coulor:"+sc.next()+"\n");
				System.out.println("Enter the maximum speed");
				s.append(" speed:"+sc.next()+"\n");
				System.out.println("Enter the number of seats");
				s.append(" coulor:"+sc.next()+"\n");
				System.out.println("Enter the number of wheels");
				s.append(" wheels:"+sc.next()+"\n");
				System.out.println("Enter the status of diskbreak(true/false)\n");
				//k=sc.next();
				s.append("disbreaks:"+sc.next());
				
				obj2.display(s);
			}
			else
			{
				System.out.println("invalid option");
			}
			
		}
	}

class Vehicle{
	
}
class Car extends Vehicle{

	public void display(StringBuffer s) {
		// TODO Auto-generated method stub
		System.out.println("car details");
		System.out.println(s);
	}
	
}
class Bike extends Vehicle{

	public void display(StringBuffer s) {
		// TODO Auto-generated method stub
		System.out.println("bike details");
		System.out.println(s);
	}
	
}
