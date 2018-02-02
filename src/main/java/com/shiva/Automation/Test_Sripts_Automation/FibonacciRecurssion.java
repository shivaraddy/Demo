package com.shiva.Automation.Test_Sripts_Automation;

import java.util.Scanner;

public class FibonacciRecurssion {

	public static int  fib(int number){
		
		return (number<=1)? number:fib(number-1)+fib(number-2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number");
		int num=sc.nextInt();
		
	for(int i=0;i<=num-1;i++){
		
		System.out.println(fib(i)+" ");
	}
		
	}
}
