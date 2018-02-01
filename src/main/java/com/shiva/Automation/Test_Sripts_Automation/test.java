package com.shiva.Automation.Test_Sripts_Automation;

import java.util.Scanner;

import org.testng.reporters.jq.Main;

public class test {
  public static void main(String[] args) {
	
	 /* System.out.println("enter number");
	 Scanner sc=new Scanner(System.in);
	 int number=sc.nextInt();*/
	/* int factorial=1;
	 for (int i=1;i<=number;i++){
	 
	 factorial= factorial*i;
	
	 }
	 System.out.println(""+factorial);*/
	 
	 
	 int n1=0;
	 int n2 =1;
	 System.out.print(n1+" "+n2);
	 int n3;
	 int count=5;
	for(int i=1;i<=count;i++){
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	
	}
 
}
}
