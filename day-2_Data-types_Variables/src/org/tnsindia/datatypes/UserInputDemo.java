package org.tnsindia.datatypes;

import java.util.Scanner;

//demo on user
public class UserInputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();
		System.out.println("enter string:"+s);
		s.close();

	}

}
