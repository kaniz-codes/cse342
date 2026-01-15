import java.util.Scanner;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        int count = 0;

        while (true) {
            System.out.println("\n1.Register  2.Search  3.Display  4.Exit");
            int x = sc.nextInt();
            sc.nextLine();

            // Register one student
            if (x == 1) {
                if (count == n) {
                    System.out.println("System full!");
                    continue;
                }

                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter student name: ");
                String name = sc.nextLine();

                System.out.print("Enter student CGPA: ");
                double cgpa = sc.nextDouble();
                sc.nextLine();

                students[count] = new Student(id, name, cgpa);
                count++;

                System.out.println("Student registered successfully!");

            // Search by ID
            } else if (x == 2) {
                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();
                sc.nextLine();

                int idx = -1;
                for (int i = 0; i < count; i++) {
                    if (students[i].id == id) {
                        idx = i;
                        break;
                    }
                }

                if (idx == -1) System.out.println("Not found");
                else students[idx].display();

            // Display all registered students
            } else if (x == 3) {
                if (count == 0) {
                    System.out.println("No students registered yet.");
                    continue;
                }

                System.out.println("\nAll registered students:");
                for (int i = 0; i < count; i++) {
                    students[i].display();
                }

            // Exit
            } else if (x == 4) {
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
