package cpeeeeee;

import java.util.Scanner;

public class cancel_item {
	
	static int  total = 0 ;
	int wart1 = 0 , wart2 = 0 , wart3 = 0 , wart4 = 0 ;
	
	public void wart (int wart1 ,int wart2 ,int wart3 ,int wart4 ,int total ) {
		this.wart1 = wart1; this.wart2 = wart2; this.wart3 =wart3; this.wart4 = wart4;
	}	
	public static void cancel(int wart1 , int wart2 , int wart3 , int wart4) {
		Scanner sc = new Scanner (System.in);
		char respo;
		
//		   cancel item  
		    do {
				do {
			System.out.println();
			line();
			System.out.println("      Are You Sure About your perchase ? ");
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
						System.out.print("Y Yes or N No : ");
						
					respo = sc.next().charAt(0);
					if(sc.hasNextLine()) {
						if (respo == 'n' || respo == 'N') {
							int ss = 0 ;
							do {
							System.out.println("  Which of the following you what to cancel ? ");
							System.out.println();
							System.out.println("          Description        Price     QTY");
							if (wart1 > 0) {
								System.out.println("   "+ "  1.) 3 IN 1 Coffee       P30" +"       "+ wart1 );
							}	
								if (wart2 > 0) {
									System.out.println("   "+ "  2.) Black Coffee        P60"+"       "+ wart2 );
								}
									if (wart3 > 0) {
										System.out.println("   " + "  3.) Iced Coffee         P90"+"       "+ wart3);
									}
										if (wart4 > 0) {
											System.out.println("   " + "  4.) Latte Coffee        P100"+"      "+ wart4);
										}
										
										System.out.print("  : ");
							if(sc.hasNextInt()) {
								ss = sc.nextInt();								
									if (ss == 1) {
										do {
										if (wart1 == 0) {
											System.out.println("no value ");
										break;
										}else if(wart1 > 0 ) {
											System.out.println("   3 in 1 Coffee  QTY : " + wart1 );
											System.out.print("     Enter Quantity To Remove : ");
											int qt = sc.nextInt();
											if (qt <= 0) {
												System.out.println(" You Entered A negative number ");
												continue;
											}else if(qt >wart1) {
												System.out.println("Over the Quantity ");
												continue;
											}else if(qt >= 0) {
												wart1 -= qt;
												break;
											}
										}else {
											
											continue;
										}
//									wart1	dowhile looop
									}while(true);
								
									}else if (ss == 2) {
										do {
										if (wart2 == 0) {
											System.out.println("no value ");
										break;
										}else if(wart1 > 0 ) {
											System.out.println("   Black Coffee : " + wart2 );
											System.out.print("     Enter Quantity To Remove : ");
											int qt = sc.nextInt();
											if (qt <= 0) {
												System.out.println(" You Entered A negative number ");
												continue;
											}else if(qt >wart2) {
												System.out.println("Over the Quantity ");
												continue;
											}else if(qt >= 0) {
												wart2 -= qt;
												break;
											}
										}else {
											
											continue;
										}
//									wart3 dowhile loopp
									}while(true);
								
									}else if (ss == 3) {
										do {
										if (wart3 == 0) {
											System.out.println("no value ");
										break;
										}else if(wart1 > 0 ) {
											System.out.println("   Icwd Coffee : " + wart3 );
											System.out.print("     Enter Quantity To Remove : ");
											int qt = sc.nextInt();
											if (qt <= 0) {
												System.out.println(" You Entered A negative number ");
												continue;
											}else if(qt >wart3) {
												System.out.println("Over the Quantity ");
												continue;
											}else if(qt >= 0) {
												wart3 -= qt;
												break;
											}
										}else {
											
											continue;
										}
//									wart3 dowhile loopp
									}while(true);
								
									}else if (ss == 4) {
										do {
										if (wart4 == 0) {
											System.out.println("no value ");
										break;
										}else if(wart1 > 0 ) {
											System.out.println("   Iced Coffee : " + wart4 );
											System.out.print("     Enter Quantity To Remove : ");
											int qt = sc.nextInt();
											if (qt <= 0) {
												System.out.println(" You Entered A negative number ");
												continue;
											}else if(qt >wart4) {
												System.out.println("Over the Quantity ");
												continue;
											}else if(qt >= 0) {
												wart4 -= qt;
												break;
											}
										}else {
											
											continue;
										}
//									wart4 dowhile loopp
									}while(true);
										
									}else {
										System.out.println("Invalid Input ");
										
										continue;
									}
									break;
								}
//							choice loop
							}while(true);
						}else if (respo == 'y' || respo == 'Y') {
							break;
						}else {
							System.out.println("Invalid input");
							continue;
						}
					}else {
						System.out.println("Invalid Input ");
						sc.next();
					}
//							second do
							}while(true);
//							first do 
				
							}while(re(respo));
		    total = (wart1*30) + (wart2*60) + (wart3*90) + (wart4*100);
		    
		    }
	
	public static boolean re(char  respo) {
		if (respo == 'y' || respo == 'Y') {
			return false;
		}else if (respo == 'n' || respo == 'N') {
			return false;
		}else {
			System.out.print("       Choose from Y yes  or N no : ");
			return true;
		}
	}
	public static boolean ca(int ss) {

		if (ss == 1) {
			return false;
		}else if (ss == 2) {
			return false;
		}else if (ss == 3) {
			return false;
		}else if (ss == 4) {
			return false;
		}else 
			System.out.println();
			System.out.println("          !! invalid input !!");
			return true;
		
	}
	public static void line() {
		System.out.println("_____________________________________");
	}
}
