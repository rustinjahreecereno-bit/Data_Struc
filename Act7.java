import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Act7 {
	static Scanner sc = new Scanner(System.in);
	static int patientCounter = 0;

	public static void main(String[] args) {
		while (true) {
			System.out.println("\n=== Main Menu ===");
			System.out.println("1. Patient Module");
			System.out.println("2. Grocery Program");
			System.out.println("3. Movie Registration");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");

			String choice = sc.nextLine();
			switch (choice) {
				case "1":
					runPatientModule();
					break;
				case "2":
					runGroceryModule();
					break;
				case "3":
					runFileManuModule();
					break;
				case "4":
					System.out.println("Goodbye.");
					return;
				default:
					System.out.println("Invalid option. Try again.");
			}
		}
	}

	//Patient
	public static int InputInt(String prompt) {
		System.out.print(prompt);
		int A = sc.nextInt();
		sc.nextLine();
		return A;
	}

	public static String InputString(String prompt) {
		System.out.print(prompt);
		String i = sc.nextLine();
		return i;
	}

	public static void Display(int patientID, String patientName, int patientAge, String patientAddress, String patientDisease) {
		System.out.println("Patient ID: " + patientID);
		System.out.println("Patient Name: " + patientName);
		System.out.println("Patient Age: " + patientAge);
		System.out.println("Patient Address: " + patientAddress);
		System.out.println("Patient Disease: " + patientDisease);
	}

	public static void runPatientModule() {
		String continueInput;
		do {
			patientCounter++;
			int patientID = patientCounter;

			String patientName = InputString("Enter Patient Name: ");

			int patientAge = InputInt("Enter Patient Age: ");

			String patientAddress = InputString("Enter Patient Address: ");

			String patientDisease = InputString("Enter Patient Disease: ");

			Display(patientID, patientName, patientAge, patientAddress, patientDisease);

			continueInput = InputString("Enter another patient? (yes/no): ");
		} while (continueInput.equalsIgnoreCase("yes"));
	}

	//Grocery
	public static void runGroceryModule() {
		String strProdName, strAnotherP, strCustomer;
		char cCustomer = 'y', cAnotherP = 'y';
		double dQty, dBill, dPrice;
		double dTotal, dPay, dChange = 0;

		do {
			dBill = 0;

			do {
				System.out.println("\n------------------------");
				System.out.print("Input product name: ");
				strProdName = sc.nextLine();

				System.out.print("Input price: ");
				dPrice = Double.parseDouble(sc.nextLine());

				System.out.print("Quantity: ");
				dQty = Double.parseDouble(sc.nextLine());

				dTotal = dQty * dPrice;
				System.out.println("Total: " + dTotal);

				dBill = dBill + dTotal;

				System.out.print("Another product Y/N? ");
				strAnotherP = sc.nextLine();
				cAnotherP = strAnotherP.length() > 0 ? strAnotherP.charAt(0) : 'n';

			} while ((cAnotherP == 'Y') || (cAnotherP == 'y'));

			System.out.println("Bill: " + dBill);
			System.out.print("Payment: ");
			dPay = Double.parseDouble(sc.nextLine());

			if (dPay >= dBill) {
				dChange = dPay - dBill;
				System.out.println("Change: " + dChange);
				System.out.println("Thank you for shopping!");
			} else {
				System.out.println("Money is not enough!");
			}

			System.out.print("Another customer Y/N? ");
			strCustomer = sc.nextLine();
			cCustomer = strCustomer.length() > 0 ? strCustomer.charAt(0) : 'n';

		} while ((cCustomer == 'Y') || (cCustomer == 'y'));

		System.out.println("Grocery program returning to main menu...");
	}

	//Movie Registration
	public static void runFileManuModule() {
		try {
			File rj = new File("samp.txt");
			FileWriter Fw = new FileWriter(rj);

			int rental = 0, sales = 0;
			int comedy = 0, horror = 0, scifi = 0, drama = 0, cartoons = 0;
			int dvdtotal = 0, vcdtotal = 0, tapetotal = 0;

			// TYPE
			System.out.println("Registration");
			Fw.write("Registration\n");
			System.out.println("1. DVD");
			Fw.write("1. DVD\n");
			System.out.println("2. VCD");
			Fw.write("2. VCD\n");
			System.out.println("3. Tape");
			Fw.write("3. Tape\n");
			System.out.print("Input code: ");
			Fw.write("Input code: ");
			int code = Integer.parseInt(sc.nextLine());
			Fw.write(code + "\n");

			if (code == 1) {
				System.out.println("Type: DVD");
				dvdtotal++;
			} else if (code == 2) {
				System.out.println("Type: VCD");
				vcdtotal++;
			} else if (code == 3) {
				System.out.println("Type: Tape");
				tapetotal++;
			}

			// CATEGORY
			System.out.println("\nCategory");
			Fw.write("\nCategory\n");
			System.out.println("1. Horror");
			Fw.write("1. Horror\n");
			System.out.println("2. Scifi");
			Fw.write("2. Scifi\n");
			System.out.println("3. Drama");
			Fw.write("3. Drama\n");
			System.out.println("4. Comedy");
			Fw.write("4. Comedy\n");
			System.out.println("5. Cartoons");
			Fw.write("5. Cartoons\n");
			System.out.print("Input category: ");
			Fw.write("Input category: ");
			int category = Integer.parseInt(sc.nextLine());
			Fw.write(category + "\n");

			if (category == 1) {
				horror++;
			} else if (category == 2) {
				scifi++;
			} else if (category == 3) {
				drama++;
			} else if (category == 4) {
				comedy++;
			} else if (category == 5) {
				cartoons++;
			}

			// TITLE
			System.out.print("Input title: ");
			Fw.write("Input title: ");
			String title = sc.nextLine();
			Fw.write(title + "\n");

			// MINUTES
			System.out.print("Input minutes: ");
			Fw.write("Input minutes: ");
			int minutes = Integer.parseInt(sc.nextLine());
			Fw.write(minutes + "\n");

			// SETTING
			int action = 0; // Initialize counters
			int anime = 0;
			int historical = 0;
			int mystery = 0;
			int romance = 0;
			int setting;

			System.out.println("1. Action");
			Fw.write("1. Action\n");
			System.out.println("2. Anime");
			Fw.write("2. Anime\n");
			System.out.println("3. Historical");
			Fw.write("3. Historical\n");
			System.out.println("4. Mystery");
			Fw.write("4. Mystery\n");
			System.out.println("5. Romance");
			Fw.write("5. Romance\n");
			System.out.print("Input setting: ");
			Fw.write("Input setting: ");
			setting = Integer.parseInt(sc.nextLine());
			Fw.write(setting + "\n");

			if (setting == 1) {
				action++;
			} else if (setting == 2) {
				anime++;
			} else if (setting == 3) {
				historical++;
			} else if (setting == 4) {
				mystery++;
			} else if (setting == 5) {
				romance++;
			} else {
				System.out.println("Invalid input!");
			}

			// --- Display Results (Example) ---
			System.out.println("\n--- Results ---");
			System.out.println("Action count: " + action);
			System.out.println("Anime count: " + anime);
			System.out.println("Historical count: " + historical);
			System.out.println("Mystery count: " + mystery);
			System.out.println("Romance count: " + romance);

			// TRANSACTION
			System.out.println("\nTransaction Type");
			Fw.write("\nTransaction Type\n");
			System.out.println("1. Rental");
			Fw.write("1. Rental\n");
			System.out.println("2. Sales");
			Fw.write("2. Sales\n");
			System.out.print("Input transaction type: ");
			Fw.write("Input transaction type: ");
			int transactiontype = Integer.parseInt(sc.nextLine());
			Fw.write(transactiontype + "\n");

			if (transactiontype == 1)
				rental++;
			else if (transactiontype == 2)
				sales++;

			// PRICE
			System.out.print("Input price: ");
			Fw.write("Input price: ");
			double price = Double.parseDouble(sc.nextLine());
			Fw.write(price + "\n");

			// REPORT
			System.out.println("\nREPORTS");
			Fw.write("\nREPORTS\n");
			System.out.println("For Rent: " + rental);
			Fw.write("For Rent: " + rental + "\n");
			System.out.println("For Sale: " + sales);
			Fw.write("For Sale: " + sales + "\n");
			System.out.println("DVD Total: " + dvdtotal);
			Fw.write("DVD Total: " + dvdtotal + "\n");
			System.out.println("VCD Total: " + vcdtotal);
			Fw.write("VCD Total: " + vcdtotal + "\n");
			System.out.println("Tape Total: " + tapetotal);
			Fw.write("Tape Total: " + tapetotal + "\n");
			System.out.println("Horror Movies: " + horror);
			Fw.write("Horror Movies: " + horror + "\n");
			System.out.println("Scifi Movies: " + scifi);
			Fw.write("Scifi Movies: " + scifi + "\n");
			System.out.println("Drama Movies: " + drama);
			Fw.write("Drama Movies: " + drama + "\n");
			System.out.println("Comedy Movies: " + comedy);
			Fw.write("Comedy Movies: " + comedy + "\n");
			System.out.println("Cartoons Movies: " + cartoons);
			Fw.write("Cartoons Movies: " + cartoons + "\n");

			Fw.close();
		} catch (Exception e) {
			System.out.println("Error in Movie Registration module: " + e.getMessage());
		}

		System.out.println("Movie Registration module returning to main menu...");
	}
}
