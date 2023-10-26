package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class SumOfDigitsMethods {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Starting Value");
		int a=scn.nextInt();
		System.out.println("Enter Ending Value");
		int b=scn.nextInt();
		System.out.println(sum(a,b));
	}
	static int sum(int a,int b)
	{
		int sum=0;
		for(int i=a;i<=b;i++) sum=sum+i;
		return sum;
	}

}
