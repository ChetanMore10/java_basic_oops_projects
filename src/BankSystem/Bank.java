package BankSystem;

public class Bank {

	public static int accNum = 123;
	public static double balance = 5000;
	public static String userName = "chetan";

	static void createAccount(int accNo, Double bal, String name) {
		accNum = accNo;
		userName = name;
		balance = bal;
		System.out.println("Account Created Succefully...");
	}

	static void checkBalace(int accNo, String name) throws AccountNotFoundException {
		if (accNum == accNo && userName.equals(name)) {
			System.out.println("User Name : " + userName);
			System.out.println("Account Number : " + accNum);
			System.out.println("Your Balance : " + balance);
		} else {
			throw new AccountNotFoundException("Account Not Found...");
		}
	}

	static void withdrowAmt(int accNo, double amt) throws InsufficientFundsException, AccountNotFoundException {
		if (accNum == accNo && userName.equals(userName)) {
			if (amt > 0 && balance >= amt) {
				balance -= amt;
				System.err.println("Withdraw : " + amt);
				System.out.println("Corrent Balance : " + balance);
			} else {
				throw new InsufficientFundsException("Insufficient Balance...");
			}
		} else {
			throw new AccountNotFoundException("Account Not Found...");
		}
	}

	static void diposit(int accNo, double amt, String name) throws AccountNotFoundException {
		if (accNum == accNo && userName.equals(name)) {
			if (amt > 0) {
				balance += amt;
				System.err.println("Diposit : " + amt);
				System.out.println("Current Balance : " + balance);
			}else {
				throw new AccountNotFoundException("Account Not Found...");
			}
		}
	}
}
