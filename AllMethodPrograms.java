package com.sudha.MethodNumberPrograms;

import java.util.Scanner;

public class AllMethodPrograms {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static int length(int n) {
		int len=0;
		for(;n>0;n/=10) {
			len++;
			}
		return len;
	}
	public static int pow(int base,int exp) {
		int total=1;
		for(int i=1;i<=exp;i++) {
			total=base*total;
		}
		return total;
	}
	public static int sum(int n) {
		int sum=0;
		for(;n>0;n/=10)sum=sum+n%10;
		return sum;
	}
	public static int checkArmstrong(int n) {
		int sum=0;
		int len=length(n);
		for(;n>0;n/=10) {
			sum=sum+pow(n%10,len);
		}
		return sum;
	}
	public static int checkStrong(int n) {
		int sum=0;
		for(;n>0;n/=10) {
			sum=sum+factorial(n%10);
		}
		return sum;
	}
	public static int checkPrime(int n)
	{
		if(n<=1) return 0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
			return 0;	
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scn.nextInt();
//		System.out.println("Enter value");
//		int b=scn.nextInt();
		if(1==checkPrime(a))System.out.println("Is a prime Number");
		else System.out.println("Is not a prime Number");
//  	System.out.println(sum(b));
		

	}

}
