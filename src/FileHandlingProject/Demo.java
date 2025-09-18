package FileHandlingProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int choice;
		do {
			System.out.println("=== Welcome to Student Portal ===");
			System.out.println("1. Add Data");
			System.out.println("2. Show Record");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			Demo demo = new Demo();

			switch (choice) {
			case 1: {
				System.out.print("How many students you want to add? ");
				int noOfStud = scanner.nextInt();
				int count = 1;
				while (count <= noOfStud) {
					Student student = demo.getStudentObjectFromUser();
					String msg = demo.updateFile(student);
					System.out.println(msg);
					count++;
				}
				System.out.println("Total students added in file : " + (count - 1));
				break;
			}
			case 2: {
				demo.showFileRecords();
				break;
			}
			case 3: {
				System.out.println("Exiting... Thank you!");
				break;
			}
			default:
				System.out.println("Invalid choice, try again!");
			}
		} while (choice != 3);

		scanner.close();
	}

	// method to take details
	private Student getStudentObjectFromUser() {
		System.out.println("\nEnter Student Details:");

		System.err.print("Enter ID: ");
		int id = scanner.nextInt();

		System.err.print("Enter First Name: ");
		String fName = scanner.next();

		System.err.print("Enter Middle Name: ");
		String mName = scanner.next();

		System.err.print("Enter Last Name: ");
		String lName = scanner.next();

		System.err.print("Enter Mobile Number: ");
		long mobileNum = scanner.nextLong();

		System.err.print("Enter Address: ");
		scanner.nextLine(); // consume newline
		String address = scanner.nextLine();

		Student student = new Student();
		student.setId(id);
		student.setfName(fName);
		student.setmName(mName);
		student.setlName(lName);
		student.setMobileNum(mobileNum);
		student.setAddress(address);

		return student;
	}

	// method to update file
	private String updateFile(Student student) throws IOException {
		String directoryPath = "C:\\Users\\HP\\Desktop\\IRise_Java\\FileHandling";
		String fileName = "StudData.txt";

		File file = new File(directoryPath, fileName);

		if (file.createNewFile()) {
			System.out.println("File created... " + fileName);
		}else {
			System.out.println("File is Already Created....");
		}

		FileWriter writer = new FileWriter(file, true);

		writer.write(student.getId() + " : ");
		writer.write(student.getfName() + " : ");
		writer.write(student.getmName() + " : ");
		writer.write(student.getlName() + " : ");
		writer.write(student.getMobileNum() + " : ");
		writer.write(student.getAddress() + System.lineSeparator());

		writer.close();

		return "Student " + student.getfName() + " updated in file: " + fileName;
	}

	// method to show records from file
	private void showFileRecords() {
		String filePath = "C:\\Users\\HP\\Desktop\\IRise_Java\\FileHandling\\StudData.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			String line;
			System.out.println("\n Student Records ");
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("-----------------------");
		} catch (IOException e) {
			System.out.println("No records found in file.");
		}
	}
}
