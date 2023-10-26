package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scn.nextInt();
		int b=scn.nextInt();
		System.out.println(factorial(a));
		System.out.println(length(a));
		System.out.println(reverse(a));
		System.out.println(sum(a));
		System.out.println(power(a,b));
	}
	public static int factorial(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++) fact=fact*i;
		return fact;
	}
	public static int length(int a)
	{
		int count=0;
		for(;a>0;a/=10) count++;
		return count;
	}
	public static int reverse(int a)
	{
		int rev=0;
		for(;a>0;a/=10) rev=rev*10+a%10;
		return rev;
	}
	public static int sum(int a)
	{
		int sum=0;
		for(;a>0;a/=10) sum=sum+a%10;
		return sum;
	}
	public static int power(int a,int b)
	{
		int power=1;
		for(int i=1;i<=b;i++) power=power*a;
		return power;
	}

}
