package com.calculator;

import java.util.Scanner;

interface Division
		{
			public void div();
		
		}
		public class DivisionImpl implements Division{

			@Override
			  public void div() {
				Scanner scanner = new Scanner(System.in);
				  System.out.print("Enter the first number >>");
				  int num= scanner.nextInt();
				  System.out.print("Enter the second number >>");
				  int num2= scanner.nextInt();
				  int result=num/num2;
				  System.out.println("Division is >>"+ result);
			}
			
				
		
		}
