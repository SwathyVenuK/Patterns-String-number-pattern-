package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;
public class Employe {


		public static void main(String[] args) throws IOException {
				// TODO Auto-generated method stub
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter your first name");
				StringBuffer name=new StringBuffer(br.readLine());
				System.out.println("Enter your last name");
				StringBuffer lastname=new StringBuffer(br.readLine());
				name.append(lastname);
				System.out.println("Enter your age");
				StringBuffer age=new StringBuffer(br.readLine());
				System.out.println("Enter your gender");
				StringBuffer gender=new StringBuffer(br.readLine());
				System.out.println("Enter your employee id");
				StringBuffer id=new StringBuffer(br.readLine());
				System.out.println("Enter your salary details");
				StringBuffer salary=new StringBuffer(br.readLine());
				System.out.println("Enter your address");
				StringBuffer address=new StringBuffer(br.readLine());
				System.out.println(name);
				System.out.println(gender);
				System.out.println(age);
				System.out.println(id);
				System.out.println(salary);
				System.out.println(address);
				
			}

		

	}


