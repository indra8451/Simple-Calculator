package com.calculator;

import java.util.Scanner;

interface Factors
{
	
	public void factor();
}
public class FactorsImpl implements Factors {

	@Override
	public void factor() {
		 Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter any number >>");
		  int num= scanner.nextInt();
		  System.out.println("Factors are >> ");
		  for(int i=2;i<=num/2;i++)
		  {
			  if(num%i==0) 
			  {
				  System.out.println(i);
				  
			  }
			  
		  }
		
	}
	
	

}
