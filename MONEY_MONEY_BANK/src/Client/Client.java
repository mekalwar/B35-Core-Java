package Client;

import Application.MMBankFactroy;
import Application.MMCurrentAcc;
import Application.MMSavingAcc;
import framework.BankFactroy;
import framework.CurrentAcc;
import framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactroy b =new MMBankFactroy();
		SavingAcc s= new MMSavingAcc(75863456,"me kalwar", 70000, true);
		CurrentAcc c = new MMCurrentAcc(856936547,"yashu sai", 20000,30000);
		
		System.out.println("Saving Account");
		s.withdraw(s.getAccBal());
		
		System.out.println();
		
		System.out.println("Current Account");
		c.withdraw(c.getAccBal());
		
		System.out.println();
		
	    System.out.println(s);
	    System.out.println(c);
	    
	   

	}

}
