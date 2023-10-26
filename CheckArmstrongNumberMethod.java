package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class CheckArmstrongNumberMethod {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scn.nextInt();
		if(sum(n)==n) System.out.println("Is a armstrong number0");
		else System.out.println("Is not a armstrong Number");
	}
	public static int sum(int i) {
		int sum=0;
		int len=length(i);
		while(i>0)
		{
			sum=sum+pow(i%10,len);
			i=i/10;
		}
		return sum;
	}
	public static int length(int j) {
		int count=0;
		while(j>0)
		{
			count++;
			j=j/10;
		}
		return count;
	}
	public static int pow(int exp,int base) {
		int product=1;
		for(int i=1;i<=base;i++) {
			product=product*exp;
		}
		return product;
	}
}	
