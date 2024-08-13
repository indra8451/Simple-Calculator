package com.calculator;

import java.util.Scanner;

interface EvenOdd
{
	public void evenoddnumber();
}

public class EvenOddNumber implements EvenOdd {

	@Override
	public void evenoddnumber() {
		 Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter the number >>");
		  int num= scanner.nextInt();
		 if(num%2==0)
		 {
			 System.out.println("It’s even number");
			 
		 }
		 else
		 {
			 System.out.println("It’s odd number");
		 }
	}

}
