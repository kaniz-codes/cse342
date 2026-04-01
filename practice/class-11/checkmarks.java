class exp1 extends Exception {
    exp1(String s) {
        super(s);
    }
}

class CheckMarks {
    int marks;

    CheckMarks(int marks) {
        this.marks = marks;
    }

    void check() throws exp1 {
        if (0 > marks || marks > 100)
            throw new exp1("Not valid marks");
        else
            System.out.println("Valid Marks");
    }
}

public class checkmarks {
    public static void main(String[] args) {
        CheckMarks ob1 = new CheckMarks(154);

        try {
            ob1.check();
        } catch (exp1 e) {
            System.out.println("Error Occurred: " + e.getMessage());
        }
    }
}