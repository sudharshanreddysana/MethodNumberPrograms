package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class ArmstrongNumberSeries {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter starting value");
		int a=scn.nextInt();
		System.out.println("Enter ending value");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(sum(i)==i) System.out.println(i);
		}
		
	}
	public static int sum(int a)
	{
		int len=length(a);
		int sum=0;
		while(a>0) {
			sum=sum+pow(a%10,len);
			a/=10;
		}
		return sum;
	}
	public static int length(int b)
	{
		int count=0;
		while(b>0) {
			b=b/10;
			count++;
		}
		return count;
	}
	public static int pow(int exp, int base) {
		int product=1;
		for(int i=1;i<=base;i++)
			product=product*exp;
		return product;
	}

}
