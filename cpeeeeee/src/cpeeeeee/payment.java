package cpeeeeee;

import java.util.Scanner;

public class payment {
	int total , subtotal; 
	static float payment;
    public static	float discountprice = 0;
	
	public void tots(int total, int subtotal) {
		this.total = total; this.subtotal = subtotal;
	}
	public static void payment_without_cancel(int total, int subtotal) {
	Scanner sc = new Scanner (System.in);
float dicsountprice;
	
	System.out.println();
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("               Payment ");
	System.out.println();
	System.out.println("       Total Amount : "+"P"+ total);
	do {
		do{
			System.out.println();
                System.out.print("        Enter payment  : ");
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
                	
                int dis=(int) ((dizz*total)/100);
                discountprice += dis;
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
	public static void paymentz ( int total , int subtotal) {
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
                    	
                    	 int dis=(int) ((dizz*total)/100);
                         discountprice += dis;
                        break;
                    }else{
                        continue;
                    }
                    
                }while(true);
                   
	}
	public void reset( float discountprice) {
		this.discountprice = discountprice;
	}

}
