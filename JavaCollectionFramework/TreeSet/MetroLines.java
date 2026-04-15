import java.util.*;

public class MetroLines {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> metro = new TreeMap<>();

        metro.put(1, "Uttara North - Agargaon");
        metro.put(2, "Gabtoli - Kamalapur");
        metro.put(3, "Purbachal - Notun Bazar");
        metro.put(4, "Mirpur - Farmgate");
        metro.put(5, "Mohammadpur - Motijheel");

        System.out.println("Available Metro Lines (Sorted):");

        for (Integer key : metro.keySet()) {
            System.out.println("Line " + key + ": " + metro.get(key));
        }
    }
}