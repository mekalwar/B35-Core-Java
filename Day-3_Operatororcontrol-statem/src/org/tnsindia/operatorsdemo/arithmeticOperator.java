package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class arithmeticOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("The addition is:"+(a+b));
      s.close();
	}

}
