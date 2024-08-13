package com.calculator;

import java.util.Scanner;

interface Addition {


	public void add();

}

public class AdditionImpl implements Addition {

	@Override
	public void add() 
	{
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("Enter the first number >>");
	  int num= scanner.nextInt();
	  System.out.print("Enter the second number >>");
	  int num2= scanner.nextInt();
	  int result=num+num2;
	 System.out.println("Addition is >>"+ result);
	}

}
