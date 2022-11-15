package cpeeeeee;

import java.util.Scanner;

public class main {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		char respo , reset;
		int ordernum = 1;
		kapi  kp = new kapi ();
		payment pay = new payment();
		recipt rec = new recipt ();
		cancel_item can = new cancel_item();
		recept_w_cancel recas= new recept_w_cancel();
		
		System.out.println("      Sij's Coffee Shop");
		System.out.println();
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		System.out.println("    ^ Welcome to Siji's Coffee Shop "  + name + " ^");
		do {
		kp.menu (name);
		
        //withcancel
//		can.cancel(kp.wart1 ,kp.wart2 , kp.wart3,kp.wart4 );
//			pay.paymentz(can.total ,kp.subtotal);
//			recas.recipt_cancel(can.wart1, can.wart2, can.wart3, can.wart4, pay.discountprice, pay.payment, can.total);
	
		
		
		//without cancel
		pay.payment_without_cancel(kp.total,kp.subtotal);
			rec.recipt(kp.wart1 ,kp.wart2 , kp.wart3,kp.wart4 , kp.total , pay.discountprice , pay.payment , ordernum );
	    
	    int wart1 = 0 , wart2 = 0 , wart3 = 0 , wart4 = 0 , total = 0 , discountprice = 0;
	    System.out.println("   Do you what another system ? press Y to restart N to stop the system");
	    System.out.print("     : ");
	    
	    reset = sc.next().charAt(0);
	    if  (reset == 'y' || reset == 'Y') {
	    kp.reset(wart1,wart2,wart3,wart4,total);
	    pay.reset(discountprice);
	    rec.discount(discountprice);
	    ordernum++;
	    }else {
	    	break;
	    }
		}while(true);
		System.out.println();
		System.out.println("The system has been closed Please restart the console ");
		sc.close();
	}

	
	
	
}	
