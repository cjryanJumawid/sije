package cpeeeeee;

import java.util.Scanner;

public class kapi {
	String name;
	static int stock_a = 10 , stock_b  = 10 , stock_c = 10 , stock_d = 10 ;
	
	char size ;
	static char choice;
	char respo;
	int  total = 0, subtotal = 0;
	int wart1 = 0 , wart2 = 0 , wart3 = 0 , wart4 = 0 ;
	public void name (String name ) {
		this.name = name;
	}
	public void choice (char choice) {
		this.choice = choice;
	}
	public void menu (String name) {
		Scanner sc = new Scanner (System.in);
			
		do {	
			do{
				
				System.out.println("______________________________________________");
			System.out.println("         Coffee Menu    Stock Availble                    " + 
			'\n' + "      A. 3 in 1 coffee       "+stock_a+"           P30             " + 
				'\n' + "      B. Black coffee        "+stock_b+"           P60             "  + 
					'\n' + "      C. Iced Coffee         "+stock_c+"           P90             " + 
						'\n' + "      D. Latte Coffee        "+stock_d+"           P100            " +
							'\n' + "                     "	);
			System.out.println("______________________________________________");
			if (stock_a == 0 && stock_b == 0 && stock_c == 0 && stock_d == 0) {
	
				System.out.println("   No Stocks Left In The System");
				break;
			}
			System.out.print("       Select your order " + name + " :");
			choice = sc.next().charAt(0);
//			CHOICE A 
				if (choice == 'a' || choice == 'A') {
					if(stock_a < 1) {
						System.out.println("    NO stack Available");
						System.out.println();
						break;
					}
					
					do {
						System.out.println();
						System.out.println("      Stacks available : " + stock_a);
						System.out.println("       3 in 1 Coffee ");
						System.out.print("        enter Quanntity : ");
						
					if (sc.hasNextInt()) {
						wart1 = sc.nextInt();
							
                                if (wart1 <= 0 ){ 
                                      System.out.println("     You've enter a invalid number");
                                      System.out.println();
                                        continue;
                               }
                                
                                if (wart1 <= stock_a) {
                                	stock_a -= wart1;
                                		int sub = wart1*30;	
                                		total += sub;
                                		System.out.println();
                                		break;
                                }else if (wart1 > stock_a) {
        							System.out.println("    You Exceed The Stock available");
        							System.out.println();
        							continue;
        						}
                                	
					}else {
						System.out.println("     Invalid input ");
						System.out.println();
						sc.next();
					}	
						
					
						}while(true);
//				CHOICE B
				}else if (choice == 'b' || choice == 'B') {
						if (stock_b < 1) {
							System.out.println("    NO stack Available");
							System.out.println();
							break;
						}
					
					do {
						System.out.println();
						System.out.println("      Stacks available : " + stock_b);
						System.out.println("       Black Coffee  ");
						System.out.print("        enter Quanntity : ");
						
						if (sc.hasNextInt()) {
							wart2 = sc.nextInt();
                                        if (wart2 <=0 ){
                                        	System.out.println("     You've enter a invalid number");
                                        	System.out.println();
                                        		continue;
                                           }
                                        if (wart2 <= stock_b) {
                                        	stock_b -= wart2;
                                        		int sub = wart2*60;	
                                        		total += sub;
                                        		System.out.println();
                                        		break;
                                        }else if (wart2 > stock_b) {
                							System.out.println("     You Exceed The Stock available");
                							System.out.println();
                							continue;
                						}
                                        	
					}else {
						System.out.println("     Invalid input ");
						System.out.println();
						sc.next();
					}
						
						}while(true);
//				CHOICE C
				}else if (choice == 'c' || choice == 'C') {
					
						if(stock_c == 0) {
							System.out.println("    NO Stack Available");
							break;
						}
					
					do {
						System.out.println();
						System.out.println("      Stacks available : " + stock_c);
						System.out.println("       3 in 1 Coffee ");
						System.out.print("        enter Quanntity : ");
						
						if (sc.hasNextInt()) {
							wart3 = sc.nextInt();
                                           if (wart3 <=0 ){ 
                                        	   System.out.println("     You've enter a invalid number");
                                        	   System.out.println();
                                        	   continue;
                                           }
					     
                                           if (wart3 <= stock_c) {
                                        	   stock_c -= wart3;
                                        	   	int sub = wart3*90;	
                                        	   		total += sub;
                                        	   		System.out.println();
                                        	   		break;
                                           }else if (wart3 > stock_c){
                                        	   	System.out.println("    You Exceed The Stock available");
                                        	   		System.out.println();
                                        	   		continue;
                                           }
                                 
					}else {
						System.out.println("      Invalid input ");
						sc.next();
					}
						}while(true);
//					CHOICE D
				}else if (choice == 'd' || choice == 'D') {
						if(stock_d == 0) {
							System.out.println(" NO Stack Available");
							break;
						}
					
					do {
						System.out.println("        Latte Coffee ");
							System.out.println("     Available stack " + stock_d);
							System.out.print("      enter Quanntity : ");
						if (sc.hasNextInt()) {
							wart4 = sc.nextInt();
											if (wart4 <=0 ){ 
												System.out.println("     You've enter a invalid number");
												System.out.println();
												continue;               
											}
											 if (wart4 <= stock_d) {
	                                        	   stock_d -= wart4;
	                                        	   	int sub = wart4*100;	
	                                        	   		total += sub;
	                                        	   		System.out.println();
	                                        	   		break;
	                                           }else if (wart4> stock_d) {
	                                        	   	System.out.println("    You Exceed The Stock available");
	                                        	   		System.out.println();
	                                        	   		continue;
	                                           }
					}else { 
						System.out.println("     Invalid input ");
						sc.next();
							}
						}while(true);
					 
				}else {
                          System.out.println();          
                      }
			
		}while (ca(choice) ||  no_stock(stock_a , stock_b, stock_c ,stock_d ));
			if (stock_a == 0 && stock_b == 0 && stock_c == 0 && stock_d == 0) {
				
				break;
			}
			
			System.out.println();
			System.out.print("     Do you what to order Again ? " + '\n' + "       Y Yes Or N no :");
			
		do {
			respo = sc.next().charAt(0);
		}while(res(respo));
		}while(respo == 'Y' || respo == 'y' || no_stock(stock_a , stock_b, stock_c ,stock_d ));
	

		
		}
	
		@SuppressWarnings("unused")
		public static boolean ca(char choice ) {

			if (choice == 'a'|| choice == 'A') {
				return false;
			}else if (choice == 'b'|| choice == 'B') {
				return false;
			}else if (choice == 'c'|| choice == 'C') {
				return false;
			}else if (choice == 'd'|| choice == 'D') {
				return false;
			}else if (choice == 'q'|| choice == 'Q' ) {
				return false;
			
			}else 
				System.out.println();
				System.out.println("          !! invalid input !!");
				return true;
			
		}
		public static boolean res(char respo ) {
			if (respo == 'y' || respo == 'Y') {
				return false;
			}else if (respo == 'n' || respo == 'N') {
				return false;
			}else {
				System.out.print("       Choose from Y yes  or N no : ");
				return true;
			}
		}
		public static boolean re(char  resss , int stock_a , int stock_b , int stock_c  , int stock_d) {
			if (resss == 'y' || resss == 'Y') {
				return false;
			}else if (resss == 'n' || resss == 'N') {
				return false;
			}else if (stock_a < 1 || stock_b < 1 || stock_c < 1 || stock_d < 1) {
				return false;
			}else {
				System.out.print("       Choose from Y yes  or N no : ");
				return true;
			}
		}
		public void reset(int wart1, int wart2 , int wart3 , int wart4, int total ) {
			this.wart1 =wart1; this.wart2 =wart2; this.wart3 = wart3; this.wart4 = wart4  ; this.total=total;
		}
		static boolean no_stock(int stock_a , int stock_b , int stock_c  , int stock_d) {
			if (stock_a == 0 && stock_b == 0 && stock_c == 0 && stock_d == 0) {
				return false;
			
			}else {
				return false;
			}
			
		}
		
}
