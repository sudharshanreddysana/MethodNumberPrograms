package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class FibonacciSeriesMethod {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		fibonacci(n);
	}
	static void fibonacci(int n)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=scn.nextInt();
		System.out.println("Enter b value");
		int b=scn.nextInt();
		System.out.println("Enter c value");
		int c=scn.nextInt();
		System.out.print(a+" "+b);
		for(int i=3;i<=n;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;b=c;
		}
	}

}
