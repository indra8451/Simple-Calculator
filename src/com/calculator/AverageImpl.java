package com.calculator;

import java.util.Scanner;

interface Average
{
	
		public void avg();
}

public class AverageImpl implements Average {

	@Override
	public void avg() {
		Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter the first number >>");
		  int num= scanner.nextInt();
		  System.out.print("Enter the second number >>");
		  int num2= scanner.nextInt();
		  System.out.print("Enter the third number >>");
		  int num3= scanner.nextInt();
		  System.out.print("Enter the fourth number >>");
		  int num4= scanner.nextInt();
		  System.out.print("Enter the fifth number >>");
		  int num5= scanner.nextInt();
		  int sum=num+num2+num3+num4+num5;
		  System.out.print("Total sum is>> "+ sum);
		  int result=sum/5;
		  System.out.println("Square is >>"+ result);
	}

}
