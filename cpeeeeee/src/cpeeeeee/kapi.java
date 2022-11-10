package cpeeeeee;

import java.util.Scanner;

public class kapi {
	String name;
	char size , choice , respo ;
	int price , total = 0;
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
			System.out.println("               Coffee Menu                  " + 
			'\n' + "      A. 3 in 1 coffee            P30             " + 
				'\n' + "      B. Black coffee             P60             "  + 
					'\n' + "      C. Iced Coffee              P90             " + 
						'\n' + "      D. Latte Coffee             P100            " );
			System.out.println("______________________________________________");
			System.out.print("    Select your order " + name + " :");
			choice = sc.next().charAt(0);
				if (choice == 'a' || choice == 'A') {
					
					System.out.println("     3 in 1 Coffee ");
					do {
						System.out.print("      enter Quanntity : ");
					if (sc.hasNextInt()) {
						wart1 = sc.nextInt();
                                if (wart1 <=0  ){ 
                                      System.out.println("     You've enter a invalid number");
                                        continue;
                               }
                                   int sub = wart1*30;	
                                   total += sub;
							break;
                                                        
					}else {
						System.out.println("     Invalid input ");
						sc.next();
					}
						}while(true);
					
				}else if (choice == 'b' || choice == 'B') {
					
					System.out.println("      Black Coffee ");
					do {

						System.out.print("       enter Quanntity : ");	
						if (sc.hasNextInt()) {
							wart2 = sc.nextInt();
                                        if (wart2 <=0 ){
                                        	System.out.println("     You've enter a invalid number");
                                          continue;
                                                  }
								int sub = wart2*60;
								total += sub;
							break;
					}else {
						System.out.println("     Invalid input ");
						sc.next();
					}
						
						}while(true);
					
				}else if (choice == 'c' || choice == 'C') {
					
					System.out.println("     Iced Coffee ");
					do {
							System.out.print("      enter Quanntity : ");
						if (sc.hasNextInt()) {
							wart3 = sc.nextInt();
                                           if (wart3 <=0 ){ 
                                        	   System.out.println("     You've enter a invalid number");
                                           continue;
                                                  
                                 }int sub = wart3*90;
								total += sub;
							break;
					}else {
						System.out.println("      Invalid input ");
						sc.next();
					}
					}while(true);
				}else if (choice == 'd' || choice == 'D') {
					
					System.out.println("     Latte Coffee ");
					do {
							System.out.print("      enter Quanntity : ");
						if (sc.hasNextInt()) {
							wart4 = sc.nextInt();
                                 if (wart4 <=0 ){ 
                                    System.out.println("     You've enter a invalid number");
                                    continue;               
                                 }int sub = wart4*100;
								total += sub;
							break;
					}else { 
						System.out.println("     Invalid input ");
						sc.next();
					}
						}while(true);
				}else {
                                    
                                }
				
		}while (ca(choice));
			System.out.println();
			System.out.print("     Do you what to order Again ? " + '\n' + "       Y Yes Or N no :");
		do {
			respo = sc.next().charAt(0);
		}while(res(respo));
		}while(respo == 'Y' || respo == 'y');
		
		}
	
		public static boolean ca(char choice) {

			if (choice == 'a'|| choice == 'A') {
				return false;
			}else if (choice == 'b'|| choice == 'B') {
				return false;
			}else if (choice == 'c'|| choice == 'C') {
				return false;
			}else if (choice == 'd'|| choice == 'D') {
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
		
}
