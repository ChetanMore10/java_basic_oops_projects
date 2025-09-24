package BankSystem;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) throws InsufficientFundsException, AccountNotFoundException {
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			
		System.out.println("Banking System : ");
		System.out.println("1. Create Account : ");
		System.out.println("2. Get Balance By Using Account Number : ");
		System.out.println("3. Withdrawn Amount : ");
		System.out.println("4. Diposit Money : ");
		System.out.println("5. Exit...");
		System.out.println("Enter Your Choice : ");

		choice = scanner.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Enter Account Number : ");
			int accNo = scanner.nextInt();
			System.out.println("Enter Customer Name : ");
			String name = scanner.next();
			System.out.println("Enter Initial Balance : ");
			double balance = scanner.nextInt();
			Bank.createAccount(accNo, balance, name);
			break;
		}
		case 2:{
			System.out.println("Enter Acount Number : ");
			int accNo = scanner.nextInt();
			System.out.println("Enter User Name : ");
			String name = scanner.next();
			Bank.checkBalace(accNo, name);
			break;
		}
		case 3: {
			System.out.println("Enter Account Number : ");
			int accNo = scanner.nextInt();
			System.out.println("Enter Withdraw Amount : ");
			double amt = scanner.nextDouble();
			Bank.withdrowAmt(accNo, amt);
			break;
		}
		case 4: {
			System.out.println("Enter Account Number : ");
			int accNo = scanner.nextInt();
			System.out.println("Enter Diposit Amount : ");
			int amt = scanner.nextInt();
			System.out.println("Enter User Name : ");
			String name = scanner.next();
			Bank.diposit(accNo, amt, name);
			break;
		}
		case 5:
            System.out.println("Exiting... Thank you!");
            break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		} while (choice != 5);
		scanner.close();
	}

}
