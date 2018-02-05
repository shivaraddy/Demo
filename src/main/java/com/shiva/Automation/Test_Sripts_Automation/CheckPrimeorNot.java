package com.shiva.Automation.Test_Sripts_Automation;

import java.util.Scanner;

public class CheckPrimeorNot {

	public static void main(String[] args) {
		
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter number");
		int number=scanner.nextInt();
		boolean isprime=true;
		
		for(int i=2;i<number/2;i++){
			if(number%i==0){
				isprime=false;
				break;
			}
			
		}
		if(isprime){
			System.out.println(number+"is prime number");
		}
		else{
			System.out.println(number+" is not prime number");
		}
		scanner.close();
	
}
}

