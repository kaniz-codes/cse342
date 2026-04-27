import java.io.*;
import java.util.*;

public class fileOperation {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("kaniz.txt");
            fw.write("Kaniz Fatema\n");
            fw.close();

            File r = new File("kaniz.txt");
            Scanner sc = new Scanner(r);

            String result = "";

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);

                String[] x = line.split(" ");

                for (String a : x) {
                    result += a.toUpperCase() + "\n";
                }
            }

            sc.close();

            FileWriter w = new FileWriter("output.txt");
            w.write(result);
            w.close();

            System.out.println("String operation written to output.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}