package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class SumOfNumberMethods {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		number(n);
	}
	static void number(int n)
	{
		int sum=0;
		for(;n>0;n/=10) sum=sum+n%10;
		System.out.println(sum);
	}

}
