import java.util.*;
import java.io.*;

public class Prac1 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        FileWriter rj = new FileWriter(file);
        int num [] = {10, 20, 30, 40, 50};
        for (int i = 0; i < num.length; i++) {
            rj.write(num[i] + "\n");
        }
        String gender [] = {"Male", "Female", "Gay", "Lesbian", "Other"};
        for (int i = 0; i < gender.length; i++) {
            rj.write(gender[i] + "\n");
        }
        rj.close();
    }
}
