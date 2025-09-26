package ilsprogramming;

import java.util.Scanner;

public class ILSPROG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("enter your age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your gender");
		String gender = sc.nextLine();
		

			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			
		sc.close();			
		

		}
	
	}
