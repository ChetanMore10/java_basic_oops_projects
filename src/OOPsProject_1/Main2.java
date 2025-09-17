package OOPsProject_1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Calculator c;

		System.out.println("Enter Your Choice : ");
		System.out.println("1. Addition : ");
		System.out.println("2. Substraction : ");
		System.out.println("3. Multiplicaton : ");
		System.out.println("4. Division : ");
		System.out.println("5. Exit");
		int input = scanner.nextInt();
		scanner.nextLine();

		do {
			switch (input) {
			case 1: {
				c = new CalAddition();
				System.out.print("Enter how many numbers you want to Addition (2-5): ");
				int choice = scanner.nextInt();

				if (choice == 2) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					System.out.println("Addition of 2 Numbers: " + c.getAddition(num1, num2));
				} else if (choice == 3) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					System.out.println("Addition of 3 Numbers: " + ((CalAddition) c).getAddition(num1, num2, num3));
				} else if (choice == 4) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					int num4 = scanner.nextInt();
					System.out
							.println("Addition of 4 Numbers: " + ((CalAddition) c).getAddition(num1, num2, num3, num4));
				} else if (choice == 5) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					int num4 = scanner.nextInt();
					int num5 = scanner.nextInt();
					System.out.println(
							"Addition of 5 Numbers: " + ((CalAddition) c).getAddition(num1, num2, num3, num4, num5));
				} else {
					System.out.println("Invalid choice!");
				}
				break;
			}
			case 2: {
				c = new CalSubstraction();
				System.out.print("Enter how many numbers you want to Substraction (2-5): ");
				int choice = scanner.nextInt();

				if (choice == 2) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					System.out.println("Substraction of 2 Numbers: " + c.getSubstraction(num1, num2));
				} else if (choice == 3) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					System.out.println(
							"Substraction of 3 Numbers: " + ((CalSubstraction) c).getSubstraction(num1, num2, num3));
				} else if (choice == 4) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					int num4 = scanner.nextInt();
					System.out.println("Substraction of 4 Numbers: "
							+ ((CalSubstraction) c).getSubstraction(num1, num2, num3, num4));
				} else if (choice == 5) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					int num4 = scanner.nextInt();
					int num5 = scanner.nextInt();
					System.out.println("Substraction of 5 Numbers: "
							+ ((CalSubstraction) c).getSubstraction(num1, num2, num3, num4, num5));
				} else {
					System.out.println("Invalid choice!");
				}
				break;
			}
			case 3: {
				c = new CalMultiplication();
				System.out.print("Enter how many numbers you want to Multiplication (2-5): ");
				int choice = scanner.nextInt();

				if (choice == 2) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					System.out.println("Multiplication of 2 Numbers: " + c.getMultiplication(num1, num2));
				} else if (choice == 3) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					System.out.println("Multiplication of 3 Numbers: "
							+ ((CalMultiplication) c).getMultiplication(num1, num2, num3));
				} else if (choice == 4) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					int num4 = scanner.nextInt();
					System.out.println("Multiplication of 4 Numbers: "
							+ ((CalMultiplication) c).getMultiplication(num1, num2, num3, num4));
				} else if (choice == 5) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					int num4 = scanner.nextInt();
					int num5 = scanner.nextInt();
					System.out.println("Multiplication of 5 Numbers: "
							+ ((CalMultiplication) c).getMultiplication(num1, num2, num3, num4, num5));
				} else {
					System.out.println("Invalid choice!");
				}
				break;
			}
			case 4: {
				c = new CalDivision();
				System.out.print("Enter how many numbers you want to Division (2-5): ");
				int choice = scanner.nextInt();

				if (choice == 2) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					System.out.println("Division of 2 Numbers: " + c.getDivision(num1, num2));
				} else if (choice == 3) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					System.out.println("Division of 3 Numbers: " + ((CalDivision) c).getDivision(num1, num2, num3));
				} else if (choice == 4) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					int num4 = scanner.nextInt();
					System.out
							.println("Division of 4 Numbers: " + ((CalDivision) c).getDivision(num1, num2, num3, num4));
				} else if (choice == 5) {
					int num1 = scanner.nextInt();
					int num2 = scanner.nextInt();
					int num3 = scanner.nextInt();
					int num4 = scanner.nextInt();
					int num5 = scanner.nextInt();
					System.out.println(
							"Division of 5 Numbers: " + ((CalDivision) c).getDivision(num1, num2, num3, num4, num5));
				} else {
					System.out.println("Invalid choice!");
				}
				break;
			}
			}
		} while (input != 5);
		scanner.close();
	}
}
