package com.calculator;

import java.util.Scanner;

interface Substraction
{
	public void sub();

}

public class SubtractionImpl implements Substraction {

	@Override
	public void sub()
	{
	      Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter the first number >>");
		  int num= scanner.nextInt();
		  System.out.print("Enter the second number >>");
		  int num2= scanner.nextInt();
		  int result=num-num2;
		  System.out.println("Substraction is >>"+ result);
	}

}
