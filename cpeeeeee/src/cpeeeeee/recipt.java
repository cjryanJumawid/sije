package cpeeeeee;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class recipt {
	int wart1 , wart2 , wart3 , wart4 ,total , ordernum;
static	float discountprice   ,  payment;
	public void discount (float discountprice) {
	
	}
	public static final  String ANSI_reset = "\u001B[0m"; 
	public static final String ANSI_blue =  "\u001B[36m";
	public static final String ANSI_purple = "\u001B[45m";
	public void wart (int wart1 ,int wart2 ,int wart3 ,int wart4 ,int total , int ordernum) {
		this.wart1 = wart1; this.wart2 = wart2; this.wart3 =wart3; this.wart4 = wart4 ; this.ordernum = ordernum;
	}
	public void payment(float payment) {
		this.payment = payment;
	}
		public static void recipt(int wart1 ,int wart2 ,int wart3 ,int wart4 ,int total , float  discountprice ,float payment , int ordernum) {
			DateFormat date_format_obj = new SimpleDateFormat("MMMM/dd/yy hh:mm:a");
	        Date date_obj = new Date();
			
			float dis = total-discountprice;
			float finalprice = (payment - dis);
	                System.out.println("_______________________________________________");
	                System.out.println(ANSI_blue +"             Sij's Coffee Shop" + ANSI_reset);
			System.out.println();
					System.out.println("          "+ date_format_obj.format(date_obj));
					System.out.println("Order Number : " + ordernum);
			System.out.println();
			 
			System.out.println(" QTY      Description        Price    Total");
			if (wart1 > 0) {
				System.out.println("  "+wart1 + "       3 IN 1 Coffee       P30" +"      P"+ wart1*30 );
			}	
				if (wart2 > 0) {
					System.out.println("  "+ wart2 + "       Black Coffee        P60"+"      P"+ wart2*60 );
				}
					if (wart3 > 0) {
						System.out.println("  "+ wart3 + "       Iced Coffee         P90"+"      P"+ wart3*90 );
					}
						if (wart4 > 0) {
							System.out.println("  "+ wart4 + "       Latte Coffee        P100"+"     P"+ wart4*100);
						}
						
				
			System.out.println("===============================================");		
			
			System.out.println(" Sub Amount       :                    P" +total );
			//System.out.println("   VAT            :                    P" + (total*(100+20)/100) );
			System.out.println(" Discount         :                    P" + discountprice);
			System.out.println();
			System.out.println(" Total Amount     :                    P" +dis);
			//System.out.println("-----------------------------------------------");
			System.out.println(" Money            :                    P" + payment);
			System.out.println(" Change           :                    P" +finalprice);
			System.out.println();
			System.out.println(ANSI_purple+" Thank You For Buying from Sij's Coffee Shop" + ANSI_reset);
			System.out.println();
			System.out.println("_______________________________________________");
			
	
			
		}
	
		

}
