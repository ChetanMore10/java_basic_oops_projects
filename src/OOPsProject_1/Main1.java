package OOPsProject_1;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Calculator c;
		// Pointing to CalAddition object

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
				System.out.println("Addition between 2 to 5 Numbers : ");
				System.out.print("Enter how many numbers you want to add (2-5): ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				String str1 = scanner.nextLine();
				String[] arr1 = str1.trim().split(" ");

				int[] temp = new int[arr1.length];
				for (int i = 0; i < arr1.length; i++) {
					temp[i] = Integer.parseInt(arr1[i].trim());
				}
				if (choice == 2) {
					System.out.println("Addition of (2 Numbers): " + c.getAddition(temp[0], temp[1]));
				} else if (choice == 3) {
					System.out.println(
							"Addition of (3 Numbers): " + ((CalAddition) c).getAddition(temp[0], temp[1], temp[2]));
				} else if (choice == 4) {
					System.out.println("Addition of (4 Numbers): "
							+ ((CalAddition) c).getAddition(temp[0], temp[1], temp[2], temp[3]));
				} else if (choice == 5) {
					System.out.println("Addition of (5 Numbers): "
							+ ((CalAddition) c).getAddition(temp[0], temp[1], temp[2], temp[3], temp[4]));
				} else {
					System.out.println("Invalid number of inputs! Please choose between 2 and 5.");
				}
				break;
			}

			case 2: {
				c = new CalSubstraction();
				System.out.println("Substraction between 2 to 5 Numbers : ");
				System.out.print("Enter how many numbers you want to Substraction (2-5): ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				String str1 = scanner.nextLine();
				String[] arr1 = str1.trim().split(" ");

				int[] temp = new int[arr1.length];
				for (int i = 0; i < arr1.length; i++) {
					temp[i] = Integer.parseInt(arr1[i].trim());
				}
				if (choice == 2) {
					System.out.println("Substraction of (2 Numbers): " + c.getSubstraction(temp[0], temp[1]));
				} else if (choice == 3) {
					System.out.println("Substraction of (3 Numbers): "
							+ ((CalSubstraction) c).getSubstraction(temp[0], temp[1], temp[2]));
				} else if (choice == 4) {
					System.out.println("Substraction of (4 Numbers): "
							+ ((CalSubstraction) c).getSubstraction(temp[0], temp[1], temp[2], temp[3]));
				} else if (choice == 5) {
					System.out.println("Substraction of (5 Numbers): "
							+ ((CalSubstraction) c).getSubstraction(temp[0], temp[1], temp[2], temp[3], temp[4]));
				} else {
					System.out.println("Invalid number of inputs! Please choose between 2 and 5.");
				}

				break;
			}
			case 3: {
				c = new CalMultiplication();
				System.out.println("Multiplicatin between 2 to 5 Numbers : ");
				System.out.print("Enter how many numbers you want to Multiplicatin (2-5): ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				String str1 = scanner.nextLine();
				String[] arr1 = str1.trim().split(" ");

				int[] temp = new int[arr1.length];
				for (int i = 0; i < arr1.length; i++) {
					temp[i] = Integer.parseInt(arr1[i].trim());
				}
				if (choice == 2) {
					System.out.println("Multiplicatin of (2 Numbers): " + c.getMultiplication(temp[0], temp[1]));
				} else if (choice == 3) {
					System.out.println("Multiplicatin of (3 Numbers): "
							+ ((CalMultiplication) c).getMultiplication(temp[0], temp[1], temp[2]));
				} else if (choice == 4) {
					System.out.println("Multiplicatin of (4 Numbers): "
							+ ((CalMultiplication) c).getMultiplication(temp[0], temp[1], temp[2], temp[3]));
				} else if (choice == 5) {
					System.out.println("Multiplicatin of (5 Numbers): "
							+ ((CalMultiplication) c).getMultiplication(temp[0], temp[1], temp[2], temp[3], temp[4]));
				} else {
					System.out.println("Invalid number of inputs! Please choose between 2 and 5.");
				}

				break;
			}
			case 4: {
				c = new CalDivision();
				System.out.println("Division between 2 to 5 Numbers : ");
				System.out.print("Enter how many numbers you want to Division (2-5): ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				String str1 = scanner.nextLine();
				String[] arr1 = str1.trim().split(" ");

				int[] temp = new int[arr1.length];
				for (int i = 0; i < arr1.length; i++) {
					temp[i] = Integer.parseInt(arr1[i].trim());
				}
				if (choice == 2) {
					System.out.println("Division of (2 Numbers): " + c.getDivision(temp[0], temp[1]));
				} else if (choice == 3) {
					System.out.println(
							"Division of (3 Numbers): " + ((CalDivision) c).getDivision(temp[0], temp[1], temp[2]));
				} else if (choice == 4) {
					System.out.println("Division of (4 Numbers): "
							+ ((CalDivision) c).getDivision(temp[0], temp[1], temp[2], temp[3]));
				} else if (choice == 5) {
					System.out.println("Division of (5 Numbers): "
							+ ((CalDivision) c).getDivision(temp[0], temp[1], temp[2], temp[3], temp[4]));
				} else {
					System.out.println("Invalid number of inputs! Please choose between 2 and 5.");
				}

				break;
			}
			}
		} while (input != 5);
		scanner.close();
	}
}

