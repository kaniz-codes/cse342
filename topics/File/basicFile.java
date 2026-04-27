import java.io.*;
import java.util.*;

public class basicFile {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("kaniz.txt");
            fw.write("Name: Kaniz Fatema\n");
            fw.write("20245103154\n");
            fw.close();

            File r = new File("kaniz.txt");
            Scanner sc = new Scanner(r);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
}
