package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		//switch case example
		switch(num)
		{
		case 1:
			{System.out.println("Kesariya");
			break;
		}
		case 2:
		{
			System.out.println("Shree-valli");
			break;
		}
		case 3:
		{
			System.out.println("Vaste");
			break;
		}
		default:
		{
			System.out.println("Invalid input");
		
		}
	}
	}
	
}
	

