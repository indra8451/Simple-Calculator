package com.calculator;

import java.util.Scanner;

interface Square
{
	public void square();
}
public class SquareImpl implements Square {

	@Override
	public void square() {
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter any number >>");
		  int num= scanner.nextInt();
		  int result=num*num;
		  System.out.println("Square is >>"+ result);
	}

}
