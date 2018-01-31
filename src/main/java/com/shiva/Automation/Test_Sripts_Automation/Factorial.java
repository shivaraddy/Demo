package com.shiva.Automation.Test_Sripts_Automation;

import java.util.Scanner;

public class Factorial {
public static int factorial1(int number){
			return (number==0 || number==1)? 1:(number*factorial1(number-1));
		}


public static void main(String[] args) {
	
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int num=sc.nextInt();
	System.out.println("factorial of "+num+"  is:"+factorial1(num));
	
}
	}

