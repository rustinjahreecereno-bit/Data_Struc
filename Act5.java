import java.util.Scanner;

public class Act5 {
    static Scanner sc = new Scanner(System.in);

    public static int InputInt(String prompt) {
        System.out.print(prompt);
        int iA=sc.nextInt(); 
        sc.nextLine();
        return iA;
    }
    public static String InputString(String prompt) {
        System.out.print(prompt);
        String iA=sc.nextLine(); 
        return iA;
    }
    public static void Display(int patientID, String patientName, int patientAge, String patientAddress, String patientDisease){
        System.out.println("Patient ID: " + patientID);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Age: " + patientAge);
        System.out.println("Patient Address: " + patientAddress);
        System.out.println("Patient Disease: " + patientDisease);
    }
    public static void main(String[] args) {

        int patientID = InputInt("Enter Patient ID: ");
       
        String patientName = InputString("Enter Patient Name: ");

        int patientAge = InputInt("Enter Patient Age: ");
        
        String patientAddress = InputString("Enter Patient Address: ");

        String patientDisease = InputString("Enter Patient Disease: ");

        Display(patientID, patientName, patientAge, patientAddress, patientDisease);
    }
}