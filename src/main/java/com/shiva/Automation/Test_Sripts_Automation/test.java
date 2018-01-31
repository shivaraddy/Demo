package com.shiva.Automation.Test_Sripts_Automation;

import java.util.Scanner;

import org.testng.reporters.jq.Main;

public class test {
  public static void main(String[] args) {
	
	  System.out.println("enter number");
	 Scanner sc=new Scanner(System.in);
	 int number=sc.nextInt();
	 int factorial=1;
	 for (int i=1;i<=number;i++){
	 
	 factorial= factorial*i;
	
	 }
	 System.out.println(""+factorial);
}
}
