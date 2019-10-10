package com.basic;

import java.util.Scanner;

public class Function_Calculator {
	private static Scanner sc;

	public static void main(String[] args) {
		int n1, n2, result;
		n1 = n2 = result = 0;

		sc = new Scanner(System.in);

		System.out.print("\nEnter n1 = "); 
		n1 = sc.nextInt();

		System.out.print("\nEnter n2 = ");
		n2 = sc.nextInt();
		
		int menu ;
		menu = sc.nextInt() ;
		switch (menu) {
		case 1 :
			result = add(n1, n2);
			System.out.println("Add n1 :" + n1 + "+ n2 : " + n2 + " = " + result);
			break ;
		case 2 :
			result = sub(n1, n2);
			System.out.println("Add n1 :" + n1 + "- n2 : " + n2 + " = " + result);
			break ;
		case 3 :
			result = mul(n1, n2);
			System.out.println("Add n1 :" + n1 + "* n2 : " + n2 + " = " + result);
			break ;	
		case 4 :
			result = div(n1, n2);
			System.out.println("Add n1 :" + n1 + "/ n2 : " + n2 + " = " + result);
			break ;	
		default :
			System.err.println("No output");
		}

		/*result = add(n1, n2);
		System.out.println("Add n1 :" + n1 + "+ n2 : " + n2 + " = " + result);*/
	}
	// main ends

	static int add(int x, int y) {
		return x + y;
	}

	static int sub(int x, int y) {
		return x - y;
	}

	static int mul(int x, int y) {
		return x * y;
	}

	static int div(int x, int y) {
		return x / y;
	}
}
