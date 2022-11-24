package org.tnsindia.packagesexecuter;

import java.util.Scanner;

//importing the class of another package
//import org.tnsindia.packagesdemo.ATM;
import org.tnsindia.packagesdemo.*;
public class ATMexecuter {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s=new Scanner (System.in);
		System.out.println("enter the card no:");
				String card_no=s.nextLine();
		ATM obj=new ATM();
		//obj.card_no="123-5321-8754";
		obj.display (card_no);
		
		
	}

}
