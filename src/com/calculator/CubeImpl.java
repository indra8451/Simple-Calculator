package com.calculator;

import java.util.Scanner;

interface Cube
{
public void cube();	

}


public class CubeImpl implements Cube {

	@Override
	public void cube() {
		 Scanner scanner = new Scanner(System.in);
		  System.out.print("Enter any number >>");
		  int num= scanner.nextInt();
		  int result=num*num*num;
		  System.out.println("Cube is >>"+ result);
	}

}
