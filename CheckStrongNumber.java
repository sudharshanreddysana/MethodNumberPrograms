package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class CheckStrongNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		//CheckStrongNumber c1=new CheckStrongNumber();
		int a=n;
		if(a==CheckStrongNumber.m1(n)) System.out.println("Is a Strong Number");
		else System.out.println("Is not a Strong Number");
	}
	public static int m1(int i) {
		int sum=0;
		while(i>0) {
			int r=i%10;
			sum=sum+m2(r);
			i=i/10;
		}
		return sum;
	}
	public static int m2(int j)
	{
		int fact=1;
		for(int i=1;i<=j;i++)
			fact=fact*i;
		return fact;
	}
}
