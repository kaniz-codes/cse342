import java.util.*;

class Student {
    int id;
    String name;

    Student() {
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(ArrayList<Student> c2) {
        for (Student s : c2) {
            System.out.println(s);
        }
    }

    public String toString() {
        return "id is: " + id + ", Name: " + name;
    }
}

public class student {
    public static void main(String[] args) {
        ArrayList<Student> c1 = new ArrayList<>();

        Student s1 = new Student(1, "Kaniz");
        Student s2 = new Student(2, "Neha");

        c1.add(s1);
        c1.add(s2);

        Student t = new Student();
        t.display(c1);
    }
}