package cpeeeeee;

import java.util.Scanner;

public class payment {
	int total; 
	float payment , discountprice;
	
	public void total (int total) {
		this.total = total;
	}
	
	public void payment (int total) {
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
                    	float dizz = 15;
                    	
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
