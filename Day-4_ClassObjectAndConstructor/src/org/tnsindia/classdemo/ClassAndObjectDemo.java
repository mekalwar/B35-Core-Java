package org.tnsindia.classdemo;

import java.util.Scanner;

public class ClassAndObjectDemo {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
				System.out.println("Enter the speed of the car is:");
				int speed=s.nextInt();
		//Creation of object
		Car obj=new Car();
		//obj.speed=45;
		obj.speed(speed);
		s.close();
	}

}
