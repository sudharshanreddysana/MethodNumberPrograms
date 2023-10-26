package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class StrongNumberSeries {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter first value");
		int a=scn.nextInt();
		System.out.println("Enter ending value");
		int b=scn.nextInt();
		StrongNumberSeries a1=new StrongNumberSeries();
		for(int i=a;i<=b;i++) {
			if(i==a1.m1(i)) System.out.println(i);
		}
	}	
		public  int m1(int i) {
			int sum=0;
			while(i>0) {
				int r=i%10;
				sum=sum+m2(r);
				i=i/10;
			}
			return sum;
		}
		public int m2(int j) {
			int fact=1;
			for(int i=1;i<=j;i++) {
				fact=fact*i;
			}
			return fact;
		}
}
