package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class CheckEvenOrOddMethod {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scn.nextInt();
		if(0==check(a)) System.out.println("Even");
		else System.out.println("Odd");
	}	
	
	static int check(int a)
	{
		if(a%2==0)
		{
			return 0;
		}
		return 1;
	}

}
