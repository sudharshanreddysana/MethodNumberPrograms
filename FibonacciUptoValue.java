package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class FibonacciUptoValue {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		m1(n);
		
	}
	static void m1(int n)
	{
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b);
		for(;;) {
			c=a+b;
			if(c>=n)  break;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
