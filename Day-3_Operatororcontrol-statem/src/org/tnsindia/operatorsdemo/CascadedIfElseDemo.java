package org.tnsindia.operatorsdemo;

import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		/*
		 * 1.minimum age >12
		 * 2.weight >120
		 */
		if(age>=12)
		{
			if(weight>=40 && weight<=120)
			{
				if(weight>120)
				{
					System.out.println("Extra ropes will be added");
				}
				System.out.println("Eligible for bunjee jumping");
			}
			else
			{
				System.out.println("Not Eligible for bunjee jumping");
			}
		}
		s.close();
		

	}

}
