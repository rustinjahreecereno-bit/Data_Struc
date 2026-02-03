import java.util.*;
import java.io.*;

public class FileManu {
    public static void main(String[] args) throws Exception {

        File rj = new File("samp.txt");
        FileWriter Fw = new FileWriter(rj);

        int rental = 0, sales = 0;
        int comedy = 0, horror = 0, scifi = 0, drama = 0, cartoons = 0;
        int dvdtotal = 0, vcdtotal = 0, tapetotal = 0;

        Scanner sc = new Scanner(System.in);

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
        int code = sc.nextInt();
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
        int category = sc.nextInt();
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

        // CLEAR BUFFER
        sc.nextLine();

        // TITLE
        System.out.print("Input title: ");
        Fw.write("Input title: ");
        String title = sc.nextLine();
        Fw.write(title + "\n");

        // MINUTES
        System.out.print("Input minutes: ");
        Fw.write("Input minutes: ");
        int minutes = sc.nextInt();
        Fw.write(minutes + "\n");

        sc.nextLine();

        // SETTING
        int action = 0; // Initialize counters
        int anime = 0;
        int historical = 0;
        int mystery = 0;
        int romance = 0;
        int setting; // Variable to hold input

        // --- User Interaction ---
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
        setting = sc.nextInt();
        Fw.write(setting + "\n"); // Get user's integer input

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
            System.out.println("Invalid input!"); // Handle incorrect input
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
        int transactiontype = sc.nextInt();
        Fw.write(transactiontype + "\n");
        ;

        if (transactiontype == 1)
            rental++;
        else if (transactiontype == 2)
            sales++;

        // PRICE
        System.out.print("Input price: ");
        Fw.write("Input price: ");
        double price = sc.nextDouble();
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
        sc.close();
    }
}
