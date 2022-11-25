package org.tnsindia.inheritancedemo;

import java.util.Scanner;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		
		System.out.println("The name of animal is:");
		Scanner s=new Scanner(System.in);
		String name1 =s.nextLine();
		System.out.println("The breed of animal is:");
		String breed1=s.nextLine();
		
		Dog d=new Dog();
		d.name=name1;
		d.breed=breed1;
		d.display();
		d.print();
		s.close();

	}

}
