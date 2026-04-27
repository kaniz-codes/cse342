
```css
Question: A city transportation authority in Bangladesh wants a system to maintain records of metro lines. Each metro line has a unique line number (int) and a line name (String). The authority requires that metro lines must be stored in a collection that automatically keeps them sorted by line number in ascending order and that the collection must not allow duplicate line numbers.

Write a Java program that:

a. Creates an appropriate collection that satisfies the above requirements
b. Inserts at least five metro lines into the collection
c. Displays all metro lines in sorted order

Example Output:
Available Metro Lines (Sorted):
Line 1: Uttara North – Agargaon
Line 2: Gabtoli – Kamalapur
Line 3: Purbachal – Notun Bazar
Line 4: Mirpur – Farmgate
Line 5: Mohammadpur – Motijheel
```

```java
import java.util.*;

public class MetroLines {
    public static void main(String[] args) {

        // TreeMap keeps keys sorted and does not allow duplicate keys
        TreeMap<Integer, String> metroLines = new TreeMap<>();

        // Inserting metro lines
        metroLines.put(1, "Uttara North - Agargaon");
        metroLines.put(2, "Gabtoli - Kamalapur");
        metroLines.put(3, "Purbachal - Notun Bazar");
        metroLines.put(4, "Mirpur - Farmgate");
        metroLines.put(5, "Mohammadpur - Motijheel");

        // Displaying metro lines in sorted order
        System.out.println("Available Metro Lines (Sorted):");
        for (Map.Entry<Integer, String> entry : metroLines.entrySet()) {
            System.out.println("Line " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
```