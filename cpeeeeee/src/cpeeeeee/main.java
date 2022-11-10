package cpeeeeee;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		char respo;;
		kapi  kp = new kapi ();
		payment pay = new payment();
		recipt rec = new recipt ();
		
		System.out.println("      Sij's Coffee Shop");
		System.out.println();
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		
		kp.menu (name);
	    pay.payment(kp.total); 
	    rec.recipt(kp.wart1 ,kp.wart2 , kp.wart3,kp.wart4 , kp.total , pay.discountprice , pay.payment);
	    
		sc.close();
	}

	
	
	
}	
