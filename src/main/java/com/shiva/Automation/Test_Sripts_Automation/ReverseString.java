package com.shiva.Automation.Test_Sripts_Automation;

public class ReverseString {
public static void main(String[] args) {
	

	String str="Shiva";
 char ch[]=str.toCharArray();
 String reverse="";
for(int i=ch.length-1;i>=0;i--){
	
	reverse=reverse+ch[i];
	
}
System.out.println(reverse);
}
}
