package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		/*
		 * when you know how many times the loop will execute then use for loop
		 */
		for(int i=1;i<num;i++)
		{
			System.out.println("Welcome to java"+i);
		}

	}

}
