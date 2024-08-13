package com.calculator;

import java.util.Scanner;

interface Modulus
{
		public void mod();
		
}

public class ModulusImpl implements Modulus {

	@Override
	public void mod() {
		Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter the first number >>");
		  int num= scanner.nextInt();
		  System.out.print("Enter the second number >>");
		  int num2= scanner.nextInt();
		  int result=num%num2;
		  System.out.println("Modulus is >>"+ result);
	}
	
	

}
