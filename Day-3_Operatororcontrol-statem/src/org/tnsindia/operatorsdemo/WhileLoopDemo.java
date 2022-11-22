package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class WhileLoopDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		int i=1;
		/*if we don't know no of iteration then use while loop
		 */
		while(i<=num)
		{
			System.out.println("Wekcome to Java"+i);
			i++;
		}
	}

}
