import java.util.Scanner;

public class Act3 {
    static Scanner sc = new Scanner(System.in);

    public static String InputString() {
        return sc.nextLine();
    }

    public static String returnString(String str) {
        return str;
    }

    public static int InputInt() {
        return sc.nextInt();
    }

    public static int returnInt(int num) {
        return num;
    }

    public static double InputDouble() {
        return sc.nextDouble();
    }

    public static double returnDouble(double num) {
        return num;
    }

    public static double ComputeNetSalary(double hourlyrate, double hoursworked, double overtimePay, double deduction) {
        double grosssalary = hourlyrate * hoursworked + overtimePay;
        double netsalary = grosssalary - deduction;
        return netsalary;
    }

    public static void DisplayResults(String Fullname, double netsalary) {
        System.out.println("Employee Name: " + Fullname);
        System.out.println("Net Salary: " + netsalary);
    }

    public static void main(String[] args) {
        System.out.print("Enter First Name: ");
        String Firstname = InputString();
        Firstname = returnString(Firstname);

        System.out.print("Enter Middle Name: ");
        String MiddleName = InputString();
        MiddleName = returnString(MiddleName);

        System.out.print("Enter Last Name: ");
        String Lastname = InputString();
        Lastname = returnString(Lastname);

        System.out.print("Enter Hourly Rate: ");
        double hourlyrate = InputDouble();
        hourlyrate = returnDouble(hourlyrate);

        System.out.print("Enter Hours Worked: ");
        double hoursworked = InputDouble();
        hoursworked = returnDouble(hoursworked);

        System.out.print("Enter Overtime Pay: ");
        double overtimePay = InputDouble();
        overtimePay = returnDouble(overtimePay);

        System.out.print("Enter Deduction: ");
        double deduction = InputDouble();
        deduction = returnDouble(deduction);

        double netsalary = ComputeNetSalary(hourlyrate, hoursworked, overtimePay, deduction);
        String Fullname = (Firstname + " " + MiddleName + " " + Lastname).trim();
        DisplayResults(Fullname, netsalary);
    }
}