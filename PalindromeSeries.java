package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class PalindromeSeries {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter stating value");
		int a=scn.nextInt();
		System.out.println("Enter stating value");
		int b=scn.nextInt();
		for(int i=a;i<=b;i++) {
			series(i);
		}
	}
	static void series(int i)
	{
		int m=i;
		int sum=0;
		for(;i>0;i/=10)
		{
			sum=sum*10+i%10;
		}
		if(m==sum)System.out.println(m);
	}

}
