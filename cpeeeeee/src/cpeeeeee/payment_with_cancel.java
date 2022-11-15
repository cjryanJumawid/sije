package cpeeeeee;

import java.util.Scanner;

public class payment_with_cancel {
	int total , subtotal; 
	static float payment;
	static float discountprice;
	
	
	/* int wart1 , wart2  , wart3  , wart4  ;
	 public void wart (int wart1 ,int wart2 ,int wart3 ,int wart4 ,int total ) {
			this.wart1 = wart1; this.wart2 = wart2; this.wart3 =wart3; this.wart4 = wart4;
		}	*/
	
	public static void paymentz ( int total) {
		Scanner sc = new Scanner (System.in);
	
	
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("               Payment ");
		System.out.println();
		System.out.println("       Total Amount : "+"P"+ total);
		do {
			do{
                    System.out.print("       Enter payment  : ");
			if(sc.hasNextInt()) {
                         payment = sc.nextFloat();
			 if (payment <= 0){
                             System.out.println("      You've Entered a negative number ");
                              continue;
                            }else {
                             break;
                         }
                        
			}else {
				System.out.println();
                                System.out.println("      Invalid Input");
				sc.next();
			}
                        }while(true);
		}while(pay(payment , total));
		
                System.out.println();
                do{
                    System.out.print("     Are You A Senior Citizen " + '\n' + "      Y yes Or N No : ");
                    char was = sc.next().charAt(0);
                    if (was == 'N' || was == 'n'){
                        break;
                    }else if (was == 'Y' || was == 'y'){
                    	float dizz = 20;
                    	
                    	discountprice = (dizz*total)/100;
                        break;
                    }else{
                        continue;
                    }
                    
                }while(true);
                   
	}
public static boolean pay(float payment , int total) {
		
		
		if (payment >= total) {
			return false;
		}else if (payment < total) {
			System.out.println("   Inufficient Money ");
			return true;
		}else if (payment != total) {
			System.out.println("invalid input");
			return true;
		}else {
			return true;
		}
			
	}
	
}
