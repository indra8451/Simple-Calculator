package com.calculator;

import java.util.Scanner;

interface Multiplication
	{
		
		public void mul();
	}
	public class MultiplicationImpl implements Multiplication {

		@Override
		public void mul() {
			  Scanner scanner = new Scanner(System.in);
			  System.out.print("Enter the first number >>");
			  int num= scanner.nextInt();
			  System.out.print("Enter the second number >>");
			  int num2= scanner.nextInt();
			  int result=num*num2;
			  System.out.println("Multiplication is >>"+ result);
			
		}
	
	}
