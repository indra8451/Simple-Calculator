package com.calculator;

import java.util.Scanner;

public class Main {

		
	public static void main(String[] args) {

		 System.out.println("Welcome to console based application\n");
	       
	        System.out.println("1. Addition of two number");
	  		System.out.println("2. Subtraction of two number");
	  		System.out.println("3. Multiplication of two number");
	  		System.out.println("4. Division of two number");
	  		System.out.println("5. Modulus of two number");
	  		System.out.println("6. Square of number");
	  		System.out.println("7. Cube of number");
	  		System.out.println("8. Average of numbers");
	  		System.out.println("9. Factors of numbers");
	  		System.out.println("10.Find out even or odd number");
	  	
			
	       while(true)
	    {  
	       Scanner scanner = new Scanner(System.in);
	    	System.out.print("Do You want Continue Type Yes or No-");
	    	String flag = scanner.next().toLowerCase();
	    	if(flag.endsWith("yes"))
	    	{
	    		System.out.println("\n");
		   		System.out.print("Enter your choice-");	   		
		   		int input=scanner.nextInt();
		   		
		   		switch(input)
		   		{
		   		case 1:
		   			AdditionImpl additionImpl= new AdditionImpl();
		   			additionImpl.add();
		   			break;
		   			
		   		case 2:
		   			SubtractionImpl subtractionImpl= new SubtractionImpl();
		   			subtractionImpl.sub();
		   			break;	
		   			
		   		case 3:
		   			MultiplicationImpl multiplicationImpl = new MultiplicationImpl();
		   			multiplicationImpl.mul();
		   			break;
		   			
		   		case 4:
		   			DivisionImpl divisionImpl = new DivisionImpl();
		   			divisionImpl.div();
		   			break;
		   			
		   		case 5:
		   			ModulusImpl modulusImpl = new ModulusImpl();
		   			modulusImpl.mod();
		   			break;
		   			
		   		case 6:
		   			SquareImpl  squareImpl = new SquareImpl();
		   			squareImpl.square();
		   			break;
		   			
		   		case 7:
		   			CubeImpl cubeImpl = new CubeImpl();
		   			cubeImpl.cube();
		   			break;
		   			
		   		case 8:
		   			AverageImpl averageImpl = new AverageImpl();
		   			averageImpl.avg();
		   			break;
		   			
		   		case 9:
		   			FactorsImpl factorsImpl = new FactorsImpl();
		   			factorsImpl.factor();
		   			break;
		   			
		   		case 10:
		   			EvenOddNumber evenOddNumber= new EvenOddNumber();
		   			evenOddNumber.evenoddnumber();
		   			break;
		   			
		   		default:
		   			System.out.println("Enter correct choice!!!!!!!!!");
		   		}
		   	
	    	}
	    	else if(flag.endsWith("no"))
	    	{
	    	 System.out.println("\n");
	    	 System.out.println("Exiting from  calculator Thank u!!!!!!!");
	    	  System.exit(0);
	    	}
	    	
	    	else
	    	{
	    		System.out.println("\n");
	    		System.out.println("Kindly enter Yes or No");
	    		System.out.println("\n");
	    		main(args);
	    	}
	    		
	   	}
	}

	

}
