package ATM.controller;

import java.util.Scanner;

import ATM.service.ATMService;

public class ATMMachine {
	public static ATMService atmService = new ATMService();
	@SuppressWarnings({ "resource"})
	public static void main(String[] args) {
		ATMMachineFunctions();
	}
	
	public static void ATMMachineFunctions() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Your Card Into The Machine and Press 1 To Continue !");
		
		if(scanner.nextInt()==1) {	
			System.out.println("Enter Your Pin : ");
			
			if(atmService.checkPinService(scanner.nextInt())) {
				
				System.out.println("Enter Your Choice : \n"
						+ "1:To Check Bal \n"
						+ "2:To Withdraw Money \n"
						+ "3:To Diposite Money \n"
						+ "0:To Exit");
				
				switch (scanner.nextInt()){
				case 1: {
					System.out.println("Your balance is : "+atmService.checkBalService());
					System.out.println("Press 0 to Exit : ");
					if(scanner.nextInt()==0) ATMMachineFunctions();;
					
					break;
				} 
				case 2: {
					System.out.println("Enter The Amount : ");
					Double bal = scanner.nextDouble();
					atmService.withdrawMoneyService(bal);
					System.out.println("Please collect your cash");
					System.out.println("Check Updated Bal : ");
					System.out.println("1: For YES \n "
							+ "2: For NO");
					int x = scanner.nextInt();
					if( x== 1) {
						System.out.println("Your balance is : "+atmService.checkBalService());
						System.out.println("Press 0 to Exit ");
						if(scanner.nextInt()==0) {
							ATMMachineFunctions();;
						}
					}else if(x==2) {
						ATMMachineFunctions();
					}
					break;
				}
				case 3:{
					System.out.println("Enter the cash into the console : ");
					double bal = scanner.nextDouble();
					atmService.dipositeMoneyService(bal);
					System.out.println("Cash diposited successfully !!");
					System.out.println("Check Updated Bal : ");
					System.out.println("1: For YES \n "
							+ "2: For NO");
					int x = scanner.nextInt();
					if(x== 1) {
						System.out.println("Your balance is : "+atmService.checkBalService());
						System.out.println("Press 0 to Exit ");
						if(scanner.nextInt()==0) {
							ATMMachineFunctions();;
						}
					}else if(x==2) {
						ATMMachineFunctions();;
					}
					break;
				}
				case 0:{
					System.out.println("Thank You for visiting abc ATM");
					ATMMachineFunctions();;
				}
				default:{
					System.out.println("Please collect your card. ");
				}
					
				}
			}else {
				System.err.println("Wrong PIN !!!");
				ATMMachineFunctions();
			}
		}
	}
}
