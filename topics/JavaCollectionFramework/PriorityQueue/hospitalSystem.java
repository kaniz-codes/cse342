/*
2. At a hospital, patients are waiting in a queue for a routine check-up. Each patient requires a
different amount of consultation time depending on their condition. For example, one patient
may need 30 minutes, another may need 10 minutes, and another may need only 5 minutes. If
patients are served in the order they arrive, those needing very short check-ups may have to
wait a long time behind patients requiring lengthy consultations. This increases overall waiting
time and reduces efficiency. To improve service and reduce waiting time, the hospital decides
to implement a system where patients requiring less consultation time are treated first. Using
Java’s Collection Framework, implement a solution that processes patients based on their
required consultation time in ascending order.

[Expected output]

Enter number of patients: 4
Enter name and consultation time:
Rahim 30
Karim 10
Ayesha 20
Lima 5

Processing Order:
Serving Lima (Time: 5 minutes)
Serving Karim (Time: 10 minutes)
Serving Ayesha (Time: 20 minutes)
Serving Rahim (Time: 30 minutes) */

import java.util.*;

class Patient implements Comparable<Patient> {
    String name;
    int time;

    Patient(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public int compareTo(Patient p) {
        return this.time - p.time; // ascending order
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Patient> queue = new PriorityQueue<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        System.out.println("Enter name and consultation time:");

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int time = sc.nextInt();

            queue.add(new Patient(name, time));
        }

        System.out.println("\nProcessing Order:");

        while (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println("Serving " + p.name + " (Time: " + p.time + " minutes)");
        }

        sc.close();
    }
}